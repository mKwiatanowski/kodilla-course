package com.kodilla.stream.book;

public final class Book {

    private final String author;
    private final String title;
    private final int YearOfPublication;
    private final String signature;

    public Book(String author, String title, int yearOfPublication, String signature) {
        this.author = author;
        this.title = title;
        YearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return YearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", YearOfPublication=" + YearOfPublication +
                ", signature='" + signature + '\'' +
                '}';
    }
}
