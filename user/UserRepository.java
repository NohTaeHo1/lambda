package user;

import crawler.CrawlerRepository;

import java.sql.*;
import java.util.HashMap;
import java.util.List;

public class UserRepository {
    private Connection connection;

    private UserRepository() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vondb",
                "root",
                "rootroot");
    }

    ;
    private static UserRepository instance;

    static {
        try {
            instance = new UserRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static UserRepository getInstance() {
        return instance;
    }


    public String test() {
        return "UserRepository 연결";
    }

    public List<?> findUsers() throws SQLException {
        String sql = "select * from articles";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            do {
                System.out.printf("ID: %d\tTitle: %10s\tContent: %10s\tWriter: %s\n",
                        rs.getInt("id"),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                System.out.println();
            } while (rs.next());
        } else {
            System.out.println("데이터가 없습니다.");
        }
        rs.close();
        pstmt.close();
        connection.close();
        return null;
    }
}