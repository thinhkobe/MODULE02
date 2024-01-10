package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int tigia=23000;
        System.out.println("nhập số usd muốn đổi");
        int USD=scanner.nextInt();
        System.out.println(USD+"USD bằng :"+USD*tigia+"VND");
    }
}
