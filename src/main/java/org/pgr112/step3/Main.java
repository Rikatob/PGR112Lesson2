package org.pgr112.step3;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("hei","Amund",Genres.FANTASY);
        book1.printValues();
        book1.setAuthor("Mamma");
        book1.setTitle("Oaml");
        System.out.println("=================================Get title========================================================");
        System.out.println(book1.getTitle());
        System.out.println("=================================Get Author========================================================");
        System.out.println(book1.getAuthor());

        book1.printValues();
        Book book2 = new Book("Amunds universe", "Adolf",Genres.CLASSIC);
        book2.printValues();

        Book book3 = new Book("Samuels sexlife","SamuelsMom",Genres.CRIME);
        Book book4 = new Book("Snorre Snopp","Mette Marit",Genres.ACTION);
        Book book5 = new Book("Frekkas", "Minnime",Genres.FANTASY);

        BookRegister register = new BookRegister();
        register.addBook(book1);
        register.addBook(book2);
        register.addBook(book3);
        register.addBook(book4);
        register.addBook(book5);
        register.checkArray();
        System.out.println("===================================Quantity======================================================");
        register.quantityInRegister();
        System.out.println("===================================AllBooks======================================================");
        register.allBooks();
        System.out.println("===================================CertainGenre======================================================");
        register.certainGenre(Genres.FANTASY);
        System.out.println("===================================CertainAuthor======================================================");
        register.certainAuthor("Minnime");

        Chapter b1ch1 = new Chapter("chapter1", 5,120);
        Chapter b1ch2 = new Chapter("chapter2", 10,120);
        Chapter b1ch3 = new Chapter("chapter3", 3,120);
        book1.addChapter(b1ch1);
        book1.addChapter(b1ch2);
        book1.addChapter(b1ch3);
        book1.checkArray();
        System.out.println("Reading time: " + book1.getReadingTime() + " sek");
        System.out.println("Number of pages: "+book1.getNumberOfPages());
        register.checkMaxReadingTime(5000);
    }
}
