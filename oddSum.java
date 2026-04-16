//Create a program to sum all odd number from 1 to a specified number 

import java.util.Scanner;

public class oddSum {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Welcome to oddSum to a specified number ");
        System.out.println("Enter a number ");
        int num=Sc.nextInt();
        int oddSum=oddSum(num);
        System.out.println("oddSum is "+oddSum);


    }
    public static int oddSum(int num){
        int i=1;
        int sum=0;
        while(i<=num){
            sum+=i;
            i+=2;

        }

        return sum;
    }
}