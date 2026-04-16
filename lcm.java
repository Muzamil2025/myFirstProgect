import java.util.Scanner;

public class lcm {

    public static void main(String[] args) {
        
        Scanner Sc =new Scanner(System.in);
        System.out.println("Welcome to lcm of two numbers :");
        System.out.println("Enter first number :");
        int num1=Sc.nextInt();
        System.out.println("Enter second number :");
        int num2 = Sc.nextInt();
        int lcm=lcm(num1, num2);
        System.out.println("lcm of "+num1 +" and "+num2 +" is "+lcm);


    }
    public static int lcm(int num1 ,int num2){

        int i =1;
        int fact  =1;
        while(true){
            fact=num1*i;
            if(fact%num2==0){
                return fact;
            }
            i++;

        }

        

    }
}