package com.company;

import java.util.Scanner;
import java.util.Random;








public class Main {

    public static void rollDice(int dieSides, int numOfDice) { //My first Method! Gets random number and prints result.

        int i = 0;
        Random rand = new Random();
        System.out.println("Here are the results of your roll:");

        for (i = 0; i < numOfDice; ++i) {
            int n = rand.nextInt(dieSides) + 1;
            System.out.println(n);



        }
        return;
    }



    public static void main(String[] args) {

        int dieSides = 0;
        int numOfDice = 0;
        char userResp = ' ';
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to the Grand Circus Casino!");
        System.out.println("We're going to roll some dice!");

        do {
            System.out.println("How many sides would you like your dice to have?");
            dieSides = scnr.nextInt();
            scnr.nextLine();

            System.out.println("How many dice would you like to roll?"); //Added user choice of number of dice.
            numOfDice = scnr.nextInt();
            scnr.nextLine();

            rollDice(dieSides, numOfDice);

            System.out.println("Do you want to roll 'em? (y/n):");
            userResp = scnr.next().charAt(0);

        } while (userResp != 'n'); { // Checks for continue.

            System.out.println("Thanks for playing!");
        }




        }

    }

