package org.example.homework03.task03;

public class Book {
    String nameBook;
    String surnameAuthor;
    Double costBook;
    Integer yearPublic;
    Integer countPages;

    public Book(String nameBook, String surnameAuthor, Double costBook, Integer yearPublic, Integer countPages) {
        this.nameBook = nameBook;
        this.surnameAuthor = surnameAuthor;
        this.costBook = costBook;
        this.yearPublic = yearPublic;
        this.countPages = countPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", surnameAuthor='" + surnameAuthor + '\'' +
                ", costBook=" + costBook +
                ", yearPublic=" + yearPublic +
                ", countPages=" + countPages +
                '}';
    }
}
