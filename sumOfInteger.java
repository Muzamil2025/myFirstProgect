//create a program to computes the sum of the digits of an number 

import java.util.Scanner;

public class sumOfInteger {

    public static void main(String[] args) {
        

        Scanner Sc=new Scanner(System.in);
        System.out.println("Welcome to sumOfDigits of an integer :");
        System.out.println("Enter a number :");
        int num =Sc.nextInt();
        int sumOfDigits=sumOfDigits(num);
        System.out.println("sum of digits "+sumOfDigits);


    }
    public static int sumOfDigits(int num){
        int i=1;
        int sum=0;
        while(num>0){
            int mod=num%10;
            sum+=mod;
            num/=10;
        }



        return sum;

    }
}