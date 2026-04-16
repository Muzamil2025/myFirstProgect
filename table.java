//create  a program to print a a table

import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Welcome to multiplication table");
        System.out.println("Enter a number to print the table ");
        int num=Sc.nextInt();
        int table=table(num);

    }
    public static int table(int num){
        int i=1;
        while(i<=10){
            System.out.println(num+" * "+i+" = "+num*i);
            i++;
        }

        return num;
    }
}