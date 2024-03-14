package com.von.api.enums;

import com.von.api.board.BoardView;
import com.von.api.user.UserController;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import com.von.api.user.UserController;
public enum UserRouter {
    EXIT("x", sc -> {
        return;
    }),
    JOIN("j", sc -> UserController.getInstance().join(sc)),
    LOGIN("l", sc -> UserController.getInstance().login(sc));
    private final String key;
    private final Consumer<Scanner> consumer;

    UserRouter(String key, Consumer<Scanner> consumer) {
        this.key = key;
        this.consumer = consumer;
    }


    public static void getP(Scanner sc) {
        getPage(sc.next()).consumer.accept(sc);

    }

    private static UserRouter getPage(String sc) {
        return Arrays.stream(values()).filter(o -> o.key.equals(sc))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));
    }
}
