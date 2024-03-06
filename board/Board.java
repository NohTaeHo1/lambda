package board;


import lombok.*;

import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString



public class Board {
    //private int id;
    private String title;
    //private String content;
    private String writer;
    private Date writeDate;
    private int views;
    private String prod;


    @Builder(builderMethodName = "builder")
    public Board(String title, String content, String writer, Date writeDate, int views) {
        this.title = title;
        //this.content = content;
        this.writer = writer;
        this.writeDate = writeDate;
        this.views = views;
    }
}