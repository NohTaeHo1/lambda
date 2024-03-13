package com.von.api;

import com.von.api.account.AccountView;
import com.von.api.article.ArticleView;
import com.von.api.board.BoardView;
import com.von.api.enums.Navigation;
import com.von.api.user.UserView;
import com.von.api.crawler.CrawlerView;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;



public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=== x-Exit " +
                    "u-User " +
                    "b-Board " +
                    "m-Account " +
                    "c-Crawler " +
                    "a-Article"
                    + "===");
            Navigation.getPage(sc);
        }
    }
}