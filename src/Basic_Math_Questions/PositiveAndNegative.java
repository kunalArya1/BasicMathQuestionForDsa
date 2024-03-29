package Basic_Math_Questions;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Positive and Negative Number Question is Here");

        System.out.print("Enter Number : - ");
        int num = sc.nextInt();

        // Approach one -> Using Nested if Else

        if(num > 0) {
            System.out.println("Number is Positive ");
        }else if( num == 0){
            System.out.println("Number is Zero");
        }else{
            System.out.println("Number is Negative");
        }

        // Approach Two -> Using Ternary Operator

        if (num == 0)
        {
            System.out.println ("Number is Zero");
        }

        else{
            String result = num > 0 ? "Number is Positive" : "Number is Negative";
            System.out.println (result);
        }

    }
}
