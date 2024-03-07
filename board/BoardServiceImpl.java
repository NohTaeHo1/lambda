package board;

import article.Article;

import java.sql.SQLException;
import java.util.List;

public class BoardServiceImpl implements BoardService {
    Article repository;
    private BoardServiceImpl(){
        repository = Article.getInstance();
    }
    private static BoardService instance = new BoardServiceImpl();

    public static BoardService getInstance(){
        return instance;
    }

    @Override
    public List<?> readArticles() throws SQLException {
        return repository.readArticles();
    }
}