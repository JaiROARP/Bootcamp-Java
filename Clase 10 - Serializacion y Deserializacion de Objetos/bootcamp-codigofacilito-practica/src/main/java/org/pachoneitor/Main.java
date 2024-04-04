package org.pachoneitor;

import org.pachoneitor.model.Book;
import org.pachoneitor.model.Librarian;
import org.pachoneitor.model.Library;
import org.pachoneitor.model.Member;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book(1, "V for Vendetta");
        Book secondBook = new Book(2, "1984");
        Book thirdBook = new Book(3, "Watchmen");

        Librarian librarian = new Librarian("Bibliotecario");
        Member member = new Member("Jairo");

        Library library = new Library();

        librarian.addBook(library, firstBook);
        librarian.addBook(library, secondBook);
        librarian.addBook(library, thirdBook);

        member.requestBook(library, 1);
        member.requestBook(library, 3);

        //try-with-resources
        try (FileOutputStream fos = new FileOutputStream("serialized-book.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos));
        }
    }
