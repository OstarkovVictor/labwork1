package lr1;

import java.util.Scanner;

public class Example3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        String weekday = in.nextLine();
        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("input date: ");
        int date = in.nextInt();

        System.out.println("Today: " + weekday + ' ' + date + " " + month);

        in.close();

    }
}
