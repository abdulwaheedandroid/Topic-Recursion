package com.abdulwaheed.topic_recursion.linkedin;

public class Recursion {

    private static void reversePrint(int [] numbers) {
        if (numbers.length == 0)
            return;
        int [] a = new int[numbers.length-1];
        for (int i = 0; i < numbers.length-1; i++)
            a[i] = numbers[i+1];
        reversePrint(a);
        System.out.println(numbers[0] + " ");
    }



    private static int factorial(int b) {
        if (b ==1)
            return 1;
        return b *factorial(b-1);
    }

    private static int greatestCommonDivisor(int a, int b) {
        int temp = a;
        if (a<b) {
            a=b;
            b = temp;
        }
        if (b==0)
            return a;
        return greatestCommonDivisor(b,(a%b));

    }

    private void decimalToBinary(int a) {
        if (a > 0) {
            decimalToBinary(a/2);
            System.out.printf("%d", a%2);
        }
    }

    private double power(double x, int n) {
        double y;
        if (n==0)
            return 1.0;
        y= power(x, n/2);
        y = y*y;
        if (n% 2 ==0)
            return y;
        return x*y;
    }
}
