package com.zq.entity;

import javax.persistence.*;

@Table(name = "tb_books")
public class TbBooks {
    private String name;

    private Double price;

    @Column(name = "bookCount")
    private Integer bookcount;

    private String author;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return bookCount
     */
    public Integer getBookcount() {
        return bookcount;
    }

    /**
     * @param bookcount
     */
    public void setBookcount(Integer bookcount) {
        this.bookcount = bookcount;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}