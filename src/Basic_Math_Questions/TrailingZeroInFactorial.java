package Basic_Math_Questions;

import java.util.Scanner;

public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :- ");
        int num = sc.nextInt();
        int fact = 1;

        int count = 0;
        for (int i = 2; i <= num ; i++) {
            fact = fact * i;
        }

        while ( fact % 10 == 0){
            fact = fact /10;
            count++;
        }
        System.out.println(count);
    }
}
