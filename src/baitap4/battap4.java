package baitap4;

import java.util.Scanner;

public class battap4 {
    public static void main(String[] args) {
        Scanner get =new Scanner(System.in);

        System.out.println("nhập chiều dài");
        float x=get.nextInt();
        System.out.println("nhập chiều cao");
        float y=get.nextInt();

        float details=(x+y)*2;
        float acreage=x*y;
        System.out.println("chu vi ="+details +"\ndiện tích ="+acreage);

    }
}
