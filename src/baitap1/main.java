package baitap1;

import com.sun.source.util.SourcePositions;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập tên của bạn");

        String name= scan.nextLine();

        System.out.println("xin chào"+name);
    }
}
