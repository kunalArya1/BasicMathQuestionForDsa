package Basic_Math_Questions;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :- ");
        int num = sc.nextInt();

        int temp = num ;
        int reverse =0;
        while (num !=0){
            reverse = (reverse * 10 ) + (num % 10 );
            num = num /10;
        }

        if (temp == reverse )
        {
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }

    }
}
