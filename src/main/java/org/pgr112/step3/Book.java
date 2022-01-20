package org.pgr112.step3;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private Genres genre;
    private Chapter[] chapters = new Chapter[20];
    private int amountOFChapters = 0;
    private int readingTime = 0;

    public Book(String title, String author, Genres genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    // Getter
    public String getTitle(){
        return title;
    }
    // Setter
    public void setTitle(String title){
        this.title = title;
    }
    // Getter
    public String getAuthor(){
        return author;
    }
    // Setter
    public void setAuthor(String author){
        this.author = author;
    }
    // Getter
    public int getNumberOfPages(){
        return numberOfPages;
    }
    // Setter
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    // Getter
    public Genres getGenre(){
        return genre;
    }
    // Setter
    public void setGenre(Genres genre){
        this.genre = genre;
    }
    //Getter
    public int getReadingTime(){
        return readingTime;
    }

    public void addChapter(Chapter chapter){
        for(int i = 0 ; i<chapters.length; i++){
            if(chapters[i] == null){
                chapters[i]=chapter;
                amountOFChapters ++;
                readingTime += chapter.getReadingTimePerPage() * chapter.getNumberOfPages();
                numberOfPages += chapter.getNumberOfPages();
                break;
            }
        }
    }
    public void checkArray(){
        for(Chapter chapter : chapters){
            System.out.println(chapter);
        }
    }

    public void printValues(){
        System.out.println("======================");
        System.out.println("Title: " +title);
        System.out.println("Author: " + author);
        System.out.println("NumberOfPages: " + numberOfPages);
        System.out.println("Genre: " + genre);
        System.out.println("ReadingTime: " + readingTime);
        System.out.println("======================");
    }



}
