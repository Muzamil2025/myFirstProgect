//Create a program to find the minimum of two number

import java.util.Scanner;

public class minOfTwoNumber {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to minima finder");
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter second number");
        int num2=sc.nextInt();

        System.out.println("minimum of "+num1+" and "+num2+ " is "+minimum(num1, num2));
    }
    public static int minimum(int num1,int num2){

        return num1<num2?num1:num2;


     
    }
}