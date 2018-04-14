package me.afua;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// A simple solution to the Week 3 Challenge
        Scanner input = new Scanner(System.in);
        boolean stopasking = false;
        int menuSelect=0;
        ArrayList<Book> library = new ArrayList<Book>();

        //Display the menu
        do{
            System.out.println("1. List Books");
            System.out.println("2. Add a Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Quit");

            System.out.println("Enter a number to continue");
            menuSelect = input.nextInt();
            if(menuSelect==1)
            {
                //List Books
            }
            else if(menuSelect==2)
            {
                //Ask for book information
            }

            else if(menuSelect==3)
            {
                //Borrow a book
            }

            else if(menuSelect==4)
            {
                stopasking = true;
            }

        }while(!stopasking);

    }
}
