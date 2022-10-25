package week8dharahomework;
// Display left angle triangle of * using nested for loops

import java.util.Scanner;

public class OoTriangePattern15 {
    public static void main(String[] args) {
        Lefttriangle();
    }

    public static void Lefttriangle() {
        int a, b, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        k = scan.nextInt();
        for (a = 0; a < k; a++) {

            for (b = 2 * (k - a); b >= 0; b--) {
                System.out.print(" ");
            }
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
