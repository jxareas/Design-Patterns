package com.jonareas.prototype;

import com.jonareas.prototype.model.Book;
import com.jonareas.prototype.model.ItemType;
import com.jonareas.prototype.model.Movie;

public class Main {
    public static void main(String... args) {
        Movie defaultMovie = (Movie) Registry.createItem(ItemType.MOVIE);
        Book defaultBook = (Book) Registry.createItem(ItemType.BOOK);

        Movie anotherMovie = (Movie) Registry.createItem(ItemType.MOVIE);
        anotherMovie.setTitle("Custom Movie");
        anotherMovie.setUrl("https://somerandommovie.com");
        Book anotherBook = (Book) Registry.createItem(ItemType.BOOK);
        anotherBook.setTitle("Custom Book");
        anotherBook.setUrl("https://somerandombook.com");


        System.out.println(defaultMovie);
        System.out.println(anotherMovie);
        System.out.println(defaultBook);
        System.out.println(anotherBook);
    }
}
