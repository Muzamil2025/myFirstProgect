// Create a program to find the greatest common divisor of two integers

import java.util.Scanner;

public class gcd {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Welcome to gcd finder :");
        System.out.println("Enter first digit :");
        int num1=Sc.nextInt();
        System.out.println("Enter second digit :");
        int num2=Sc.nextInt();
        int gcd =gcd(num1, num2);
        System.out.println("gcd of "+num1+" and "+num2+" is "+gcd);


    }
    public static int gcd(int num1,int num2 ){
        int i=2;
        int gcd=1;

        int least =least(num1, num2);
        while(i<=least){

            if(num1%i==0&&num2%i==0){
                gcd=i;
                return gcd;
            
            }
            i++;
        }


       return gcd;
    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }

    }
      
}