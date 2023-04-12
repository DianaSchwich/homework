package homework;

import java.util.Scanner;

public class scannerAndAnd {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("please enter the length");
        int length = scann.nextInt();

        System.out.println("please enter the width");
        int width = scann.nextInt();

        int value = 18;
        int value1 = 16;

        if (length == 18 && width == 16) {
            System.out.println("rectangle");
            if (length == 16 && width == 16) {
                System.out.println("square");
            }

        }
    }
}


