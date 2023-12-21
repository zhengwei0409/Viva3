
package com.mycompany.viva3.Question2;

public class Question2 {
    
    public static void main(String[] args) {
        
        Library lib = new Library();
        
        Book book1 = new Book("The Standard Book of Spells","Miranda Goshawk", "9452297");
        Book book2 = new Book("Advanced Potion-Making","Libatius Borage", "4826972");
        Book book3 = new Book("Fantastic Beasts and Where to Find Them", "Newt Scamander", "1564815");
        Book book4 = new Book("The Dark Forces: A Guide to Self-Protection", "Quirinus Quirrell", "1891568");
        Book book5 = new Book("Forbidden Spells", "Salazar Slytherin", "7134567");
        
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);
        
        System.out.println("\nSeaching for books by author: ");
        lib.findBooksByAuthor("Miranda Goshawk");
        
        System.out.println("\nSearching for books by title: ");
        lib.findBooksByTitle("The Standard Book of Spells");
        
        boolean canBorrow = lib.borrowBook("9452297");
        if (canBorrow) {
            System.out.println("\nYou've borrowed a book!");
        } else {
            System.out.println("\nSorry, this book is not available for borrowing.");
        }
        
        System.out.println("\nSorted Books:");
        lib.sortBooks();
        lib.displayLibrary();
        
        lib.removeBook("1564815");
        
        System.out.println("\nUpdated Library: ");
        lib.displayLibrary();
    }
}
