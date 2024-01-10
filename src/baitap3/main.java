package baitap3;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("nhập số cần đọc");

        int number = scan.nextInt();
        if (number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("số" + number + "đọc là" + "zero");
                    break;
                case 1:
                    System.out.println("số" + number + "đọc là" + "one");
                    break;
                case 2:
                    System.out.println("số" + number + "đọc là" + "two");
                    break;
                case 3:
                    System.out.println("số" + number + "đọc là" + "three");
                    break;
                case 4:
                    System.out.println("số" + number + "đọc là" + "four");
                    break;
                case 5:
                    System.out.println("số" + number + "đọc là" + "five");
                    break;
                case 6:
                    System.out.println("số" + number + "đọc là" + "six");
                    break;
                case 7:
                    System.out.println("số" + number + "đọc là" + "seven");
                    break;
                case 8:
                    System.out.println("số" + number + "đọc là" + "eight");
                    break;
                case 9:
                    System.out.println("số" + number + "đọc là" + "nine");
                    break;
                case 10:
                    System.out.println("số" + number + "đọc là" + "ten");
                    break;
                default:   System.out.println(" out of ability\n");

            }
        } else if (number > 10 && number <= 20) {
            int ones=number%10;
            switch(ones){
                case 1:System.out.println("số" + number + "đọc là" + "Eleven");
                    break;
                case 2:
                    System.out.println("số" + number + "đọc là" + "Twelve");
                    break;
                case 3:
                    System.out.println("số" + number + "đọc là" + "Thirteen");
                    break;
                case 4:
                    System.out.println("số" + number + "đọc là" + "Fourteen");
                    break;
                case 5:
                    System.out.println("số" + number + "đọc là" + "Fifteen");
                    break;
                case 6:
                    System.out.println("số" + number + "đọc là" + "Sixteen");
                    break;
                case 7:
                    System.out.println("số" + number + "đọc là" + "Seventeen");
                    break;
                case 8:
                    System.out.println("số" + number + "đọc là" + "Eighteen");
                    break;
                case 9:
                    System.out.println("số" + number + "đọc là" + "Nineteen");
                    break;

                default:   System.out.println(" out of ability\n");
            }
        }else if (number > 20 && number <= 99) {

            int ones=number%10;
            int tens=number/10;
            String chuc ="";
            String donvi = "";
            switch(ones){
                case 0:
                    donvi="";
                    break;
                case 1:
                    donvi="one";
                    break;
                case 2:
                    donvi="two";
                    break;
                case 3:
                    donvi="three";
                    break;
                case 4:
                    donvi="four";
                    break;
                case 5:
                    donvi="five";
                    break;
                case 6:
                    donvi="six";
                    break;
                case 7:
                    donvi="seven";
                    break;
                case 8:
                    donvi="eight";
                    break;
                case 9:
                    donvi="nine";
                    break;

                default:   System.out.println(" out of ability\n");
            }
            switch(tens){
                case 0:
                    donvi="";
                    break;
                case 1:
                    donvi="one";
                    break;
                case 2:
                    chuc="Twenty";
                    break;
                case 3:
                    chuc="Thirty";
                    break;
                case 4:
                    chuc="Forty";
                    break;
                case 5:
                    chuc="Fifty";
                    break;
                case 6:
                    chuc="Sixty";
                    break;
                case 7:
                    chuc="Seventy";
                    break;
                case 8:
                    chuc="Eighty";
                    break;
                case 9:
                    chuc="Ninety";
                    break;

                default:   System.out.println(" out of ability\n");
            }
            System.out.println("số"+number+"đọc là :"+chuc+donvi);
        } else if (number > 20 && number <= 99) {

        }

    }
}
