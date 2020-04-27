package R155_Methods_17;

import java.util.Scanner;

public class FibonacciNumbers_VoidMethods {
    /*
    Complete a method fib() that will compute Fibonacci numbers
In Fibonacci series, next number is the sum of previous two numbers
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of Fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.
Input  : 2
Output : 1

Input  : 9
Output : 34
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int[] arr = new int[num + 2];

        arr[0] = 0;

        arr[1] = 1;

        for (int i = 2; i <= num; i++) {

            arr[i] = arr[i-1] + arr[i-2];

            }

        System.out.println(arr[num]);

    }
}
