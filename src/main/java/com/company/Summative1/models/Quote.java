package com.company.Summative1.models;

import java.util.Objects;

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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quote quote = (Quote) o;
        return getId() == quote.getId() &&
                Objects.equals(getAuthor(), quote.getAuthor()) &&
                Objects.equals(getQuote(), quote.getQuote());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, quote);
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}

