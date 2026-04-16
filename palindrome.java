//Create a parogram to check weather a number is palindrome or not....

import java.util.Scanner;

class palindrome{

    public static void main(String[] args) {
        
        Scanner Input=new Scanner(System.in);
        System.out.println("Welcome to palindrome checker");
        System.out.println("Enter your number");
        int num=Input.nextInt();
        boolean isPalindrome=isPalindrome(num);
        if(isPalindrome){
            System.out.println("Your number is palindrome");
        }else{
            System.out.println("Your number is not palindrome");
        }

    }


    public static boolean isPalindrome(int num) {

        return num==reverseNum(num);
        
    }

    public static int reverseNum(int num){

        int result=0;
        while(num>0){
            int digit=num%10;
            result *=10+digit;
            num/=10; 
        }

        return result;


    }
}