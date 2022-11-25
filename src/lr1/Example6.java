package lr1;

import java.util.Scanner;

public class Example6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input year of birth: ");
        int year_of_birth = in.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + (2022- year_of_birth));
        in.close();

    }
}
