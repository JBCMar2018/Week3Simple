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
        Book aBook = new Book();
        String theTitle="";

        //Display the menu
        do{
            System.out.println("1. List Books");
            System.out.println("2. Add a Book");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Quit");

            System.out.println("Enter a number to continue");
            menuSelect = input.nextInt();
            //Don't forget the nextLine() here!;
            input.nextLine();
            if(menuSelect==1)
            {
                //List Books
                for (Book book:library) {
                    System.out.println("Title:"+book.getTitle());
                    System.out.println("Author:"+book.getAuthor());
                    System.out.println("Year of Publication:"+book.getYearPub());
                    System.out.println("Availability:"+book.getAvailable());
                    System.out.println("ISBN:"+book.getISBN());

                }
            }
            else if(menuSelect==2)
            {

                //Ask for book information
                aBook = new Book();
                System.out.println("Enter title:");
                aBook.setTitle(input.nextLine());
                library.add(aBook);

            }

            else if(menuSelect==3)
            {
                //Borrow a book
                System.out.println("Enter title:");
                theTitle = input.nextLine();
                Book toBorrow = new Book();

                for (Book eachBook:library)
                {
                        //Pull the book whose title matches the title off the shelf
                        if(theTitle.equalsIgnoreCase(eachBook.getTitle()))
                        {
                            toBorrow = eachBook;
                        }
                }
                //Borrow the book
                toBorrow.setAvailable("borrowed");

                //Make sure the library's records are updated
                library.set(library.indexOf(toBorrow),toBorrow);

            }

            else if(menuSelect==4)
            {
                stopasking = true;
            }

        }while(!stopasking);

    }
}
