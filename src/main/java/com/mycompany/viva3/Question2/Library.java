
package com.mycompany.viva3.Question2;

import java.util.ArrayList;

public class Library {
    
    // arraylist for storing the collections in a library
    ArrayList<Book> collections = new ArrayList<Book>();
    
    // method use for adding book to the library
    public void addBook(Book book) {
        this.collections.add(book);
    }
    
    // method use for removing a book from the library
    public void removeBook(String ISBN) {
        for(Book i : collections) {
            if(i.getISBN().equals(ISBN)) {
                collections.remove(i);
                return; // exit the method
            }
        }
    }
    
    // method use for finding a book
    public void findBooksByTitle(String title) {
        
        System.out.printf("\nBooks by title '%s':\n" , title);
        
        // loop through the collections
        for(Book i : collections) {
            
            if(i.getTitle().equalsIgnoreCase(title)) {
                
                System.out.println("Title: " + i.getTitle());
                System.out.println("Author: " + i.getAuthor());
                System.out.println("ISBN: " + i.getISBN());
                return; // exit the method
            }
        }
        
        System.out.println("Error 404 Book Not Found");
    }
    
    public void findBooksByAuthor(String author) {
        
        System.out.printf("\nBooks by author '%s':\n" , author);
        
        // loop through the collections
        for(Book i : collections) {
            
            if(i.getAuthor().equalsIgnoreCase(author)) {
                
                System.out.println("Title: " + i.getTitle());
                System.out.println("Author: " + i.getAuthor());
                System.out.println("ISBN: " + i.getISBN());
                return; // exit the method
            }
        }
        
        System.out.println("Error 404 Book Not Found");
    }
    
    // method use for borrow book
    public boolean borrowBook(String ISBN) {
        
        int ISBN_num = Integer.parseInt(ISBN);
        int ISBN_last_digit = ISBN_num % 10;
        int ISBN_last_second_digit = (ISBN_num / 10) % 10;
        
        if(isPrime(ISBN_last_digit) && isPrime(ISBN_last_second_digit)) 
            return false;
        else
            return true;
    }
    
    // method use for check prime number
    public boolean isPrime(int n) {
        
        if (n < 2) {
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
                return false;
        }
        
        return true;
    }
    
   // method use for sorting the collections in ascending order by book's title
   public void sortBooks() {
       // use bubble sort (because this is the only sorting algorithm i know hahahaha)
       for(int i = 0; i < collections.size() - 1; i++) {
           for(int j = 0; j < collections.size() - i - 1; j++) {
               if(collections.get(j).getTitle().compareToIgnoreCase(collections.get(j+1).getTitle()) > 0) {
                   Book temp = collections.get(j);
                   collections.set(j, collections.get(j+1));
                   collections.set(j+1, temp);
               }
           }
       }
   }
   
   // method use for display the library
   public void displayLibrary() {
       System.out.println("\nBook in the library: ");
       for(Book n : collections) {
           System.out.println("Title : " + n.getTitle());
           System.out.println("Author : " + n.getAuthor());
           System.out.println("ISBN : " + n.getISBN());
           System.out.println();
       }
   }
}
