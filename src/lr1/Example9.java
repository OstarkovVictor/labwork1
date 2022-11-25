package lr1;

import java.util.Scanner;

public class Example9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num1 = in.nextInt();

        int sqr = ((num1-1)+(num1+1)+(num1)) * ((num1-1)+(num1+1)+(num1));
        System.out.println("Result: " + (num1-1) +' '+ (num1) +' '+ (num1+1) +' '+ sqr);

        in.close();

    }
}
