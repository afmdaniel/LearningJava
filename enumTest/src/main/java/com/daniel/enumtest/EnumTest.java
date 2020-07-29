package com.daniel.enumtest;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books: ");
        
        // imprime todos os livros em enum Book
        for (Book book : Book.values()){
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }
        
        System.out.printf("%nDisplay a range of enum constants:%n");
        
        // imprime os primeiros quatro livros
        int i = 1;
        for (Book book : EnumSet.range(Book.MAT, Book.GEO)){
            book.setNumero(i);
            System.out.printf("%-10s%-45s%s%n%s%n", book, book.getTitle(), book.getCopyrightYear(),book.getNumero());
            i++;
        }
        for (Book book : EnumSet.range(Book.MAT, Book.GEO)){
            System.out.printf("%-10s%-45s%s%n%s%n", book, book.getTitle(), book.getCopyrightYear(),book.getNumero());
        }
    }
}
