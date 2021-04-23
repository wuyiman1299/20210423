package com.company;

public class Domo {
    public static void main(String[] args) {
        Uncleone uncleone = new Uncleone();
        uncleone.fahongbao(); // 继承的方法
        uncleone.chouyan();

        Uncletwo uncletwo = new Uncletwo();
        uncletwo.fahongbao(); //覆写之后的方法
        uncletwo.hejiu();

        UncletwoSon uncletwoSon = new UncletwoSon();
        uncletwoSon.fahongbao();
         uncletwoSon.songche();


    }
}
