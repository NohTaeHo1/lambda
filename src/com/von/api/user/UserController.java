package com.von.api.user;


import com.von.api.enums.Messenger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class UserController {
    private static UserController instance = new UserController();
    UserServiceImpl us;
    private UserController() {
        us = UserServiceImpl.getInstance();
    }
    public static UserController getInstance() {
        return instance;
    }

    public String addUsers() {
        String msg = us.addUsers();
        return msg;
    }

    public String countUsers() {
        return null;

    }
    public String join(Scanner sc) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, " +
                "이름, 주민번호 전화번호, " +
                "주소, 직업을 입력해주세요");


        return us.join(User.builder()
                .username(sc.next())
                .password(sc.next())
                .passwordConfirm(sc.next())
                .name(sc.next())
                //.address(sc.next())
                .job(sc.next())
                .build())
                ;
    }

    public Map<String, ?> getUserMap() {
        return us.getUserMap();
    }

    public String login(Scanner sc) {
        return us.login(User.builder()
                .username(sc.next())
                .password(sc.next())
                .build());
    }

    public Optional<User> findById(Scanner sc) {
        return us.findById(Long.parseLong(sc.next()));
    }


    public List<?> findUsersByJob(Scanner sc) {
        return us.findUsersByJob(User.builder()
                .job(sc.next())
                .build());
    }

    public String test() {
        return us.test();
        //return UserRepository.getInstance().test();

    }

    public List<?> findUsers() throws SQLException {
        return us.findUsers();
    }

    public Messenger createTable() throws SQLException {
        return us.createTable();
    }

    public String deleteTable() throws SQLException {
        return us.deleteTable();
    }
}