package week8dharahomework;
// Write a program in Java to display the pattern like a triangle with a number.

import java.util.Scanner;

public class FfTriangeNumbers6 {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
