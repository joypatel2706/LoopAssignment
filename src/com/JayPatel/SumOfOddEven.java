package com.JayPatel;

import java.util.Scanner;

public class SumOfOddEven {

    public void sumOfOddEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find Sum of odd and even digits: ");
        long num = sc.nextLong();
        long revNumber =0 ;
        long tmp,sumOfOdd=0,sumOfEven=0;


        while (num > 0){
            tmp = num % 10 ;
            if (tmp%2 ==0) sumOfEven += tmp;
            if (tmp%2 !=0) sumOfOdd+= tmp;
            num /=  10;
        }
        System.out.print("Sum of even number is: "+sumOfEven+"\nSum of Odd Number is: "+sumOfOdd);
    }
}
