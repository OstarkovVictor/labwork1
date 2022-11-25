package timus.task1293;

import java.util.Scanner;

public class task1293 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("enter the number of sheets: ");
        int number = in.nextInt();
        System.out.println("enter the height of sheets: ");
        int sizes1 = in.nextInt();
        System.out.println("enter the weight of sheets: ");
        int sizes2 = in.nextInt();
        System.out.println("You need " + (sizes1*sizes2*number*2) + " nanograms of thorium");
        in.close();

    }
}
