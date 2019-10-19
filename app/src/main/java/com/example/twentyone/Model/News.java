package com.example.twentyone.Model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class News {

    private Long id;
    private String nameNews;
    private String descriptionNews;
    private String imageIcon;
    private List<String> imagesNews;
    private Date createdDate;

    public News(Long id, String nameNews, String descriptionNews, String imageIcon, List<String> imagesNews) {
        this.id = id;
        this.nameNews = nameNews;
        this.descriptionNews = descriptionNews;
        this.imageIcon = imageIcon;
        this.imagesNews = imagesNews;
        this.createdDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public String getNameNews() {
        return nameNews;
    }

    public String getDescriptionNews() {
        return descriptionNews;
    }

    public String getImageIcon() {
        return imageIcon;
    }



    public List<String> getImagesNews() {
        return imagesNews;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(id, news.id) &&
                nameNews.equals(news.nameNews) &&
                descriptionNews.equals(news.descriptionNews) &&
                Objects.equals(imageIcon, news.imageIcon) &&
                Objects.equals(imagesNews, news.imagesNews) &&
                createdDate.equals(news.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameNews, descriptionNews, imageIcon, imagesNews, createdDate);
    }
}
