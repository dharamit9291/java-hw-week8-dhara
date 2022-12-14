package week8dharahomework;

/*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false*/
    public class EePalindromeNumber5 {
    public static void main(String[] args) {
        System.out.println("isPalindrome(-1221) : " + isPalindrome(-1221));
        System.out.println("isPalindrome(707) : " + isPalindrome(707));
        System.out.println("isPalindrome(11212) : " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}
