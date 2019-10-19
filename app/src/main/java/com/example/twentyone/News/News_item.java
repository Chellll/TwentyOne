package com.example.twentyone.News;

public class News_item {

    public String nameTheme;
    public String nickUser;
    public String createdDate;
    public String description;
    public int idLogo;
    public int idDescr;

    public News_item(String nameTheme, String nickUser, String createdDate, String description, int idLogo, int idDescr) {
        this.nameTheme = nameTheme;
        this.nickUser = nickUser;
        this.createdDate = createdDate;
        this.description = description;
        this.idLogo = idLogo;
        this.idDescr = idDescr;
    }
}
