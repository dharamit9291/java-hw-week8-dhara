package week8dharahomework;
/*Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
        -Before the user enters the number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        number*/
import java.util.Scanner;
public class BbMinAndMaxInputChallenge2 {
    public static void main(String[] args){
        minMax();
    }
    public static void minMax(){
        Scanner scan = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int number;
        double sum = 0;
        int amountOfNumbers = 0;
        do {
            System.out.print("Enter any number, or enter less than '0' to stop: ");
            number = scan.nextInt();
            if (number < 0) {
                break;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
            sum += number;
            amountOfNumbers++;
        } while (number >= 0);

        if (amountOfNumbers > 0) {
            System.out.printf("The minimum number is: %d.%n", minNumber);
            System.out.printf("The maximum number is: %d.%n", maxNumber);
        }
    }
}
