package R154_Methods_16;

import java.util.Scanner;

public class CheckIfNumberIsPalindrome_VoidMethods {
    /*
    Complete a method isPalindrome() that will check if number is a palindrome. Print your result as a boolean (true or false).
Example:
input: 1001
output: true

Example:
input: 1234
output: false
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE

               int reverseNumber = 0;

        int remainder = 0;

        int originalNumber = num;

        while (num > 0){

            remainder = num % 10;

            reverseNumber = (reverseNumber * 10) + remainder;

            num = num / 10;

        }

        if (originalNumber == reverseNumber) {

            System.out.println("true");
        }else {

            System.out.println("false");
        }


    }
}
