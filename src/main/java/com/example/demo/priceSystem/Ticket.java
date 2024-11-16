package com.example.demo.priceSystem;

public class Ticket {

    private String title;

    private double price;

    public Ticket(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Ticket() {
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
