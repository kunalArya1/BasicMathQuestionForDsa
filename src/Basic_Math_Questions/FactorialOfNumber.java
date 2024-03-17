package Basic_Math_Questions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :- ");
        int num = sc.nextInt();

        // Approach First
     /*   int fact = num;
        while (num != 1 ){
            fact = fact * (num-1);
            num--;
        }*/

        // Approach Second
        int fact2 = 1;
        for(int i =2 ;i<= num; i++){
            fact2 = fact2 * i;
        }
        System.out.println(fact2);
    }
}
