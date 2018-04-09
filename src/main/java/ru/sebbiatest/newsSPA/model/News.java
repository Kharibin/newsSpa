package ru.sebbiatest.newsSPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news.table")
public class News {

    @Id
    @Column(name="id")
    private
    Long ID;

    @Column(name="category")
    private String category;

    @Column(name="short_description")
    private String shortDescription;

    @Column(name="content")
    private String content;

    public News() {
    }

    public News(Long ID, String category, String shortDescription, String content) {
        this.ID = ID;
        this.category = category;
        this.shortDescription = shortDescription;
        this.content = content;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
