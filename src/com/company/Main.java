package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter a movie: ");
       String movie =keyboard.next();
       int mCount=0;
       String repeat="";
       while (!repeat.equalsIgnoreCase("quit")){
           System.out.print("The movie is: " +movie);
           System.out.println();
           System.out.print("Enter another movie title: ");
           Scanner keyboard1 = new Scanner(System.in);
           movie=keyboard1.nextLine();
           repeat =movie;
           mCount++;

           /**if (repeat.equals("quit")){

               break;
           }**/
          ;
       }
       System.out.println("Number of Movies: " +mCount);




    }
}
