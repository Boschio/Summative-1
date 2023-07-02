package com.company.Summative1.models;

public class Quote {

    private int id;
    private String author;
    private String quote;

    public Quote(){};
    public Quote(int id ,String author ,String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }
}

