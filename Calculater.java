import java.util.*;

public class Calculater {

    public static void main(String[]args){
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scan.nextDouble();

            System.out.println("Select operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.println("Choose the options");
            double Choose = scan.nextInt();
            if(Choose==1){
                double Result=num1+num2;
                System.out.println(Result);
            }
            else if(Choose==2){
                double Result=num1-num2;
                System.out.println(Result);
            }
            else if(Choose==3){
                double Result=num1*num2;
                System.out.println(Result);
            }
            else if(Choose==4){
                double Result=num1/num2;
                System.out.println(Result);
            }
            else if(Choose==5){
                System.out.println("Thank you");
                scan.close();
                return;

            }
            else{
                System.out.println("Invalid");
            }
        }
        
    }
}


