package org.example.homework03.task03;

/*
 Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 Найти названия книг, в которых простое количество страниц,
 фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */

import java.util.ArrayList;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        List<Book> books = getBook();
        List<String> listBook = new ArrayList<String>();
        for(Book book: books) {
            if ((book.surnameAuthor.startsWith("A")) && (book.yearPublic >= 2010)) {
                if (findSimple(book.countPages)) {
                    listBook.add(book.nameBook);
                }
            }
        }

        for (int i = 0; i < listBook.size(); i++) {
            System.out.println(listBook.get(i));
        }
    }

    public static boolean findSimple(int num) {
        boolean flag = true;
        if (num == 1) return true;
        else {
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static List<Book> getBook(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book ("book1", "Author1", 100.0, 2010, 37));
        books.add(new Book ("book2", "Author2", 200.0, 2009, 67));
        books.add(new Book ("book3", "Author3", 300.0, 2011, 73));
        books.add(new Book ("book4", "Author4", 400.0, 2023, 300));
        books.add(new Book ("book5", "Author5", 500.0, 2007, 200));
        books.add(new Book ("book6", "Author6", 600.0, 2015, 100));
        books.add(new Book ("book7", "Buthor1", 700.0, 2022, 200));
        books.add(new Book ("book8", "Author7", 800.0, 2010, 307));
        books.add(new Book ("book9", "Author8", 900.0, 2003, 100));
        books.add(new Book ("book10", "Buthor2", 1000.0, 2022, 50));
        return books;
    }
}
