package com.company;

import  java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        // write your code here
        // kreiranje File objekta
        java.io.File file = new java.io.File("scores.txt");


        // kreiranje Scanner objekta za File objekat
        Scanner input = new Scanner("scores.txt");
            // ucitavanje podataka sa datoteke file
            while (input.hasNext()) {
                String firstName = input.nextLine();
               // String mi = input.nextLine();
                String lastName = input.nextLine();
                int score = input.nextInt();
                System.out.println("First name: " + firstName
                        + " last name " + lastName + " score " + score
                );
            }
            input.close();


    }
}
