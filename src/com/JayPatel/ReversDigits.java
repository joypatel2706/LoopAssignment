package com.JayPatel;

import java.util.Scanner;

public class ReversDigits {

    public void reversDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to revers: ");
        long num = sc.nextLong();
        long revNumber =0 ;
        long tmp;

        while (num > 0){
            tmp = num % 10 ;
            revNumber = revNumber *10 + tmp;
            num /=  10;
        }
        System.out.print(revNumber);
    }

}
