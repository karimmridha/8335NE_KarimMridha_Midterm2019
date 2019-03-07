package math.problems;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int a,b,c;
        a = 0;
        b = 0;
        c = 1;
        System.out.println("Fibonacci Series:");
        for(int i = 1; i <= 40; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a+" ");
        }

    }
}
