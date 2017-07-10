package edu.bionic.domain;

import java.time.LocalDateTime;

/**
 * Created by c268 on 10.07.2017.
 */
public class Review {
    private String date;
    private String name;
    private String text;
    private Integer rating;

    public Review(String date, String name, String text, Integer rating) {
        this.date = date;
        this.name = name;
        this.text = text;
        this.rating = rating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
