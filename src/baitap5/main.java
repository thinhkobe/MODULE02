package baitap5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");

        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + "chia hết cho 3 và 5");

        } else if (number % 3 == 0) {
            System.out.println(number + "chia hết cho 3");

        } else if (number % 5 == 0) {
            System.out.println(number + "chia hết cho 5");
        } else if (number % 3 != 0 && number % 5 != 0) {
            System.out.println(number + " không chia hết cho 3 và 5");

        }
    }
}
