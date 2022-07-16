package com.jonareas.prototype;

import com.jonareas.prototype.model.Book;
import com.jonareas.prototype.model.Item;
import com.jonareas.prototype.model.ItemType;
import com.jonareas.prototype.model.Movie;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Registry {

    private static final EnumMap<ItemType, Item> items = new EnumMap<>(ItemType.class);

    static {
        loadItems();
    }

    public static Item createItem(ItemType type) {
        Item item = null;
        try {
            item = (Item) (items.get(type).clone());
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
        }
        return item;
    }


    private static void loadItems() {

        Movie movie = new Movie();
        movie.setTitle("Default Movie Name");
        movie.setPrice(10.99);
        movie.setHoursOfRuntime(5);
        items.put(ItemType.MOVIE, movie);

        Book book = new Book();
        book.setTitle("Default Book Name");
        book.setPrice(6.99);
        book.setNumberOfPages(100);
        items.put(ItemType.BOOK, book);

    }


}
