//Create a program to find if the number entered is even or odd

import java.util.Scanner;

class EvenOdd{

    public static void main(String[] args) {
        


        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to evenOdd checker :");
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int even=num;
        //System.out.println("num is "+even(num));

        int result=even(num);
    }
    public static int even(int num){

        //int even=num;
        //int odd=num;
        //return num%2==0? "even":"odd";
        if(num%2==0){
            System.out.println("your number is even ");
        }else{
            System.out.println("your number is odd");
        }
        return 0;
    }
}