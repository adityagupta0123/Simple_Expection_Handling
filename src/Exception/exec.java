package Exception;

import java.util.Scanner;

public class exec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        try {
             c = a/b;
            System.out.println("value of c : "+ c);
        }
        catch (ArithmeticException e) {
            System.out.println("wrong input : " + e);
        }
        System.out.println("\nProgram end");
    }
}
