package com.von.api.user;

import com.von.api.enums.UserRouter;

import java.sql.SQLException;
import java.util.Scanner;


public class UserView {
    public static void main(Scanner sc) throws SQLException {
        UserController uc = UserController.getInstance();
        //System.out.println("adduser 수 : "+msg);

        while (true) {
            System.out.println("[메뉴]\n 0-종료\n " +
                    "1-회원가입\n " +
                    "2-로그인\n " +
                    "3-ID검색\n " +
                    "4-비번변경\n " +
                    "5-탈퇴\n " +
                    "ls-회원목록\n " +
                    "7-이름검색\n " +
                    "8-직업검색\n " +
                    "9-회원수\n " +
                    "touch-테이블생성\n " +
                    "rm-테이블삭제\n ");
            UserRouter.getP(sc);
        }
    }
}
