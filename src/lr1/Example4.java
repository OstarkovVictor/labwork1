
package lr1;

import java.util.Scanner;

public class Example4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("input how many days is in this month: ");
        int size = in.nextInt();

        System.out.println( month + " is " + size +" days");

        in.close();

    }
}
