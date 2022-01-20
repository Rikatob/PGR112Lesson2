package org.pgr112.step3;

public class Chapter {
    private String title;
    private int numberOfPages;
    private int readingTimePerPage;

    public Chapter(String title, int numberOfPages, int readingTimePerPage){
        this.title = title;
        this.numberOfPages=numberOfPages;
        this.readingTimePerPage = readingTimePerPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getReadingTimePerPage() {
        return readingTimePerPage;
    }

    public void setReadingTimePerPage(int readingTimePerPage) {
        this.readingTimePerPage = readingTimePerPage;
    }
}

