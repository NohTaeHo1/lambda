package com.von.api;

import com.von.api.enums.Navigation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

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