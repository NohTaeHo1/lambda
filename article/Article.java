package article;

import java.sql.*;
import java.util.Date;
import java.util.List;

public class Article {
    private Article() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/vondb",
                "root",
                "rootroot");
    }
    private static Article instance;

    static {
        try {
            instance = new Article();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Article getInstance(){
        return instance;
    }
    //private int id;
    private String title;
    //private String content;
    private String writer;
    private Date writeDate;
    private int views;
    private String prod;

    private Connection connection;



    public List<?> readArticles() throws SQLException {
        String sql = "select * from articles";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
            do {
                System.out.printf("ID: %d\tTitle: %10s\tContent: %10s\tWriter: %s\n",
                        rs.getInt("id"),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                System.out.println();
            } while (rs.next());
        }else{
            System.out.println("데이터가 없습니다.");
        }
        rs.close();
        pstmt.close();
        connection.close();
        return null;
    }
}
