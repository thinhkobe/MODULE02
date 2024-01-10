package bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập lựa chọn");
        int N = scanner.nextInt();
        switch (N){
            case 1:
                System.out.println(N+"đọc là một");
                break;
            case 2:
                System.out.println(N+"đọc là hai");
                break;
            case 3:
                System.out.println(N+"đọc là ba");
                break;
            case 4:
                System.out.println(N+"đọc là bốn");
                break;
            case 5:
                System.out.println(N+"đọc là năm");
                break;
            case 6:
                System.out.println(N+"đọc là sáu");
                break;
            case 7:
                System.out.println(N+"đọc là bảy");
                break;
            case 8:
                System.out.println(N+"đọc là tám");
                break;
            case 9:
                System.out.println(N+"đọc là chín");
                break;
            default:
                System.out.println("không đọc được");
        }
    }
}
