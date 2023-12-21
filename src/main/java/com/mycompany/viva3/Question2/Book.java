
package com.mycompany.viva3.Question2;

public class Book {
    
    // create instance variable for a book
    private String book_title;
    private String book_author;
    private String book_ISBN;
    
    // constructor for book
    public Book (String title, String author, String ISBN) {
        this.book_title = title;
        this.book_author = author;
        this.book_ISBN = ISBN;
    }
    
    // necessary accessor
    public String getTitle() {
        return this.book_title;
    }
    
    public String getAuthor() {
        return this.book_author;
    }
    
    public String getISBN() {
        return this.book_ISBN;
    }
    
    // necessary mutator 
    public void setTitle(String title) {
        this.book_title = title;
    }
    
    public void setAuthor(String author) {
        this.book_author = author;
    }
    
    public void setISBN(String ISBN) {
        this.book_ISBN = ISBN;
    }
}
