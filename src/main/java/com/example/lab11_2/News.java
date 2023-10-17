package com.example.lab11_2;

public class News {
    private int id;
    private String title;
    private String description;
    private String fullText;
    private String imageUrl;

    public News() {
    }

    public News(int id, String title, String description, String fullText, String imageUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.fullText = fullText;
        this.imageUrl = imageUrl;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
