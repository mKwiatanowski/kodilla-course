package com.kodilla.patterns.library;

import java.time.LocalDate;

public final class Book {

    final String title;
    final String author;
    final LocalDate publicationdate;

    public Book(final String title, final String author, final LocalDate publicationdate) {
        this.title = title;
        this.author = author;
        this.publicationdate = publicationdate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationdate() {
        return publicationdate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationdate=" + publicationdate +
                '}';
    }
}
