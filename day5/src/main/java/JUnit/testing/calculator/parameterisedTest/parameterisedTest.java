package JUnit.testing.calculator.parameterisedTest;

import java.util.Scanner;
import java.util.function.Supplier;

public class parameterisedTest {
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        if(isEven(number)){
            System.out.println("Number "+number+" is Even");
        }
        else{
            System.out.println("Number "+number+" is odd");

        }

    }
}
