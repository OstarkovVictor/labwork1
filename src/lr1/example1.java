package lr1;

import java.util.Scanner;

public class example1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input surname: ");
        String surname = in.nextLine();
        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input secondname: ");
        String secondname = in.nextLine();

        System.out.println("Hello, " + surname +' '+ name +' '+  secondname);
        in.close();

    }
}