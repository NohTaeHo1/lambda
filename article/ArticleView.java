package article;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ArticleView {
    public static void main(Scanner sc) throws SQLException {
        ArticleController ac = new ArticleController();

        switch (sc.nextInt()) {
            case 0:
                return;
            case 1:
                List<?> ls = ac.findAll();
                break;

        }

    }
}
