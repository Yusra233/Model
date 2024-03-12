package org.example.model;

public class ShoppingList {

    private int personId;
    private int bookId;

    public ShoppingList(){
        }

    public ShoppingList(int personId, int bookId) {
        super();
        this.personId = personId;
        this.bookId = bookId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

}
