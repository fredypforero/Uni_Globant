package com.main;

import com.models.Operations;

import java.util.Scanner;

public class main {
    public main ( ) {
    }

    public static void main (String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        Operations uniGlobant = new Operations();
        int i=0;
        do {
            System.out.println("Welcome to UniGlobant Class Programmer The new Time is Comming!");
            System.out.println(" Select the option ");
            System.out.println("0. to Exit.");
            System.out.println("1. Print all the Teachers.");
            System.out.println("2. Print all Chairs");
            System.out.println("3. Create a New Student.");
            System.out.println("4. Create a New Teacher.");
            System.out.println("5. Create a New Class.");
            System.out.println("6. Search by Student ID");
            i = reader.nextInt();
            uniGlobant.menu(i);

        } while(i != 0);

    }
}
