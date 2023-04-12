package homework;

import java.util.Scanner;

public class hhh {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if (x>y && x>z) {
            System.out.println("The larges number is " + x);

        }
        else if(y>x && y>z) {
            System.out.println("The larges number is " + y);}

        else{
            System.out.println("The larges number is"+z);
        }

    }
}
