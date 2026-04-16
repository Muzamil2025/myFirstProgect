/*Create a program to calculate the student,s score categorize as "high" ,"moderate" or "low"
using the ternary operator */

import java.util.Scanner;

public class studentScore {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ternary operator :");
        System.out.println("Enter your marks :");
        int marks=sc.nextInt();

        System.out.println(grade(marks));
    }
    public static int grade(int marksS){

        String result=marks>80?"High" :(marks>50?"moderate":"low");
        System.out.println("Your grade is "+result);
        return 0;
    }
}