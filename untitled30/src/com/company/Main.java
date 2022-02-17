package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("The number: ");

        int numb= inp.nextInt();
        int basSayi=0;
        int value;
        int total=0;
        int numb_1=numb;
        while(numb_1!=0) {
            numb_1/=10;
            basSayi++;
        }
        numb_1=numb;


        for(int i=1;i<=basSayi;i++){
            value=numb_1%10;
            total+=value;
            numb_1/=10;

        }
        System.out.print(""+total);
    }
}