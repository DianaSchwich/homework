package homework;

import java.util.Scanner;

public class ifNestedBeach {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Is it sunny outside?");
        boolean sunny=scan.nextBoolean();
        if(sunny){
            System.out.println("It is a sunny day, I should go somewhere");
        }else{
            System.out.println("I stay home and practice Java");}

            System.out.println("What is the temperature outside");
        int temperature=scan.nextInt();
        if(temperature>85){
            System.out.println("I am going to the beach");

        }else{
            System.out.println("I am going to the park");
        }
    }
}
