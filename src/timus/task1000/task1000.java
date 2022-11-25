package timus.task1000;

import java.util.Scanner;

public class task1000{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        System.out.println("Sum: " + (num1+num2));

        in.close();

    }
}
