package com.von.api.product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    public void systemOut() {
        Item s = new Item();
        String s3 = s.systemOut();
        System.out.println("-->" + s3);
        //String s2 = "Hello";
        Assertions.assertEquals(s.systemOut(), "Hello");
    }

    @Test
    public void add() {
        Item s = new Item();
        int input1 = 2;
        int input2 = 3;
        int s3 = s.add(input1, input2);
        System.out.println("실제계산값-->" + s3);
        Assertions.assertEquals(s.add(input1, input2), 5);
    }

}