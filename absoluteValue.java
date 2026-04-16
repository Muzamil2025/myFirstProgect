//Create a program to calculate the absolute value of a given integer

import java.util.Scanner;

public class absoluteValue {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to absolute value :");
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        System.out.println("Absolute value of "+num+" is "+absolute(num));

    }
    public static int absolute(int num){

        return Math.abs(num);
    }
}