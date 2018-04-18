package com.bit.whdalive.demoparcelableserializable;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 123698745L;
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
