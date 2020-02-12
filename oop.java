package pkg;

import java.io.*;

public class oop extends poo {
    public oop(){
        //super();
    }
    public void add(String str){
        this.b.append(str);
    }
    public void run(){
        this.b.append("hello");
        System.out.println(this.b);
        int rs = 5;
        rs = rs/3;
        System.out.println(rs);
    }
}