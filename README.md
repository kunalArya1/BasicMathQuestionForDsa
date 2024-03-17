
# Basic Math Question For Dsa 

This is a repo where you will get all the basic Math Question. 
This Question will help you in your Dsa Learning Journey.


### 1. Check whether given number is Negative , positive or Zero ?


```java
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


```

### 2. Given a number N, the task is to return the count of digits in this number.

```java
package Basic_Math_Questions;


import java.util.Scanner;

// Count digit in number
public class DIgitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :-  ");
        int n = sc.nextInt();
        int count = 0 ;

        // Approach one
        while (n !=0){
            n = n /10;
            count++;
        }
        // Approach two
        for (int i = n; n != 0 ;i--){
            n = n/10;
            count++;
        }

        System.out.println(count);
    }
}


```

### 3. Given an integer, write a function that returns true if the given number is palindrome, else false. For example, 12321 is palindrome, but 1451 is not palindrome. 

```java
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

```

### 4. We are given a number. The task is to find the factorial of the number. The factorial (n!) of a number is the product of all the integers from 1 to that number
```java
package Basic_Math_Questions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :- ");
        int num = sc.nextInt();

        // Approach First
        int fact = num;
        while (num != 1 ){
            fact = fact * (num-1);
            num--;
        }

        // Approach Second
        int fact2 = 1;
        for(int i =2 ;i<= num; i++){
            fact2 = fact2 * i;
        }
        System.out.println(fact2);
    }
}

```

### 5.GCD or HCF of two Numbers 
```java
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

```