package org.pgr112.step3;

import java.util.ArrayList;

public class BookRegister {
    ArrayList<Book> register = new ArrayList<>();
    int amountInRegister=0;

public void addBook(Book book){
        register.add(book);
        amountInRegister++;

}


    public void quantityInRegister(){
            System.out.println("Amount of books in register: " + amountInRegister);
            System.out.println("===========================");
    }

    public void allBooks(){
        for(Book i : register){
            i.printValues();
        }
    }

    public void certainGenre(Genres genre){
        for(Book books:register){
            if(books.getGenre() == genre){
                books.printValues();
            }
        }
    }


    public void certainAuthor(String author) {
        for(Book books: register){
            if(books.getAuthor().equalsIgnoreCase(author)){
                books.printValues();
            }
        }
    }

    public void checkMaxReadingTime(int readingTime){
        for(Book books : register){
            if(books.getReadingTime() <= readingTime){
                books.printValues();
            }
        }
    }


    public void checkArray(){
        System.out.println("Books in register: ");
        System.out.println("===========================");
        for(Book i : register) {
            System.out.println(i);
        }
        System.out.println("===========================");
    }
}
