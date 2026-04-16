//write a function to calculate factorial of a number 

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome to factorial system");
        System.out.println("Enter a number to calculate factorial of number ");
        int num=Sc.nextInt();
        long factorial=factorial(num);
        System.out.println("Factorial of "+num+" ="+factorial);

        
    }
    public static long factorial(int num){
        int i=1;
        long fact=1;
        while(i<=num){
            fact*=i;
            i++;
        }

        return fact;
    }
}