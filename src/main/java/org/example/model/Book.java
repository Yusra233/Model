package org.example.model;

public class Book
{
    private String title;
    private String author;
    private Type type;
    private int bid;

    private static int bookId = 1;
    public enum Type{
        MYSTERY, HORROR, CLASSICS, FANTASY, POETRY, FICTION;
    }
    public Book(){
        bid=bookId++;
    }

    public Book(String title, String author, Type type) {
        super();
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getId() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type=" + type +
                ", id=" + bid +
                '}';
    }
}
