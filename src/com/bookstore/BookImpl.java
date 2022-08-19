package com.bookstore;

import data.Author;
import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author();
        book.setTitle("Life of Mine");
        book.setDescription("This book shows the stories of the author");
        book.setISBNNumber(4501);
        book.setPrice(499.0);
        author.setAuthorName("Lallu Prasad");
        author.setAuthorPenName("Lallu writes");
        book.setAuthor(author);
        book.displayDetailsOfBook();
    }
}
