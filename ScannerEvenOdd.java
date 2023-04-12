package homework;

import java.util.Scanner;

public class ScannerEvenOdd {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("In");
        int num=inp.nextInt();
        if(num<0){
            System.out.println((num)+" "+"is negative");

        }else if (num>0){
            System.out.println((num)+" "+"is positive");

        } else if(num==0){
            System.out.println(" Entered number equals to 0");

        }
    }
}
