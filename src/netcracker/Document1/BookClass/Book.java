package netcracker.Document1.BookClass;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private Author authors[];
    private double price;
    private int qty=0;

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.authors = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name=" + name + ',' +
                "authors=" + Arrays.toString(authors) +
                ",price=" + price +
                ",qty=" + qty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && qty == book.qty && Objects.equals(name, book.name) && Arrays.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, price, qty);
        result = 31 * result + Arrays.hashCode(authors);
        return result;
    }

    public String getAuthorName()
    {
        String s="";
        for(Author author1: authors)
        {
            s+=author1.getName();
        }
        return s.substring(0,s.length()-1);
    }

}
