package week8dharahomework;
/*Write a program in Java to display the pattern like a diamond.
        While loop*/

import java.util.Scanner;

    public class NmDiamondPattern14 {
    public static void main(String[] args) {

        int x;
        int y;
        int z;
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner scanner = new Scanner(System.in);
        z = scanner.nextInt();
        for (x = 0; x <= z; x++) {
            for (y = 1; y <= z - x; y++)
                System.out.print(" ");
            for (y = 1; y <= 2 * x - 1; y++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (x = z - 1; x >= 1; x--) {
            for (y = 1; y <= z - x; y++)
                System.out.print(" ");
            for (y = 1; y <= 2 * x - 1; y++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
