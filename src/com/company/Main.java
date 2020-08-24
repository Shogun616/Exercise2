package com.company;

import java.util.Scanner;

public class Main {

    static String word = " Java är kul!";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputNumber;

        System.out.print("Skriv ett tal: ");
        inputNumber = scan.nextInt();

        for (int i = 1; i <= inputNumber; i++){
            System.out.println(word);
        }
    }
}
