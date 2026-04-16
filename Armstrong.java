import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner  Sc=new Scanner(System.in);
        System.out.println("Welcome to armstrong checker");
        System.out.println("Enter your number");
        int num=Sc.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong");

        }else{
            System.out.println("Your number is not Armstrong");
        }

    }
    public static boolean isArmstrong(int num){

        return 0;

    }
}
