package org.pachoneitor.model;

import java.io.Serial;
import java.io.Serializable;

public class Book implements Serializable {



    private int id;
    private String title;
    private boolean available = true;
    private static int counter;

    public Book(int id, String title) {
        this.id = counter++;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }



    public void setTitle(String title) {
        this.title = title;
    }
}
