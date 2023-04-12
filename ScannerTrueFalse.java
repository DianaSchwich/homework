package homework;

import java.util.Scanner;

public class ScannerTrueFalse {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Please enter first number");
        int number1 = scann.nextInt();
        System.out.println("Please enter second number");
        int number2 = scann.nextInt();

        int x = 5;
        int y = 3;
        if ((x * y) > 0) {
            System.out.println(true);
        } else if ((x * y) < 0) {
            System.out.println(false);

        }
    }
}



