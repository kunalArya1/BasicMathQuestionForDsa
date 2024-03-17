package Basic_Math_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class GcdAndHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers :- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        // Approach 1

        /**
         *
         * int res = Math.min(num1,num2);
         *
         *         while ( res > 0 ) {
         *             if(num1 % res == 0 && num2 % res ==0) {
         *                 break;
         *             }
         *
         *             res--;
         *         }
         *         System.out.println(res);
         * */

        // Approach 2

        while (num1 != num2) {
            if (num1 > num2 ){
                num1 = num1-num2;

            }else  {
                num2 = num2-num1;
            }
        }
        System.out.println(num1);



    }
}
