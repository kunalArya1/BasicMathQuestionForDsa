
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