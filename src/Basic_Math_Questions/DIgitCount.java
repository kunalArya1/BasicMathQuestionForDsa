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
