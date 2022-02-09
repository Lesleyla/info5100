package com.company;

public class solution9 {

    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", 123456789, "novel", 30.0);
        book1.setName("To Kill a Mockingbird");
        book1.setBookID(123456789);
        book1.setGenres("novel");
        book1.setPrice(30.0);
        System.out.println("Name of book:"+book1.getName()+";");
        System.out.println("BookID::"+book1.getBookID()+";");
        System.out.println("Genres:"+book1.getGenres()+";");
        System.out.println("Price:"+book1.getPrice()+".");

    }
}
