package com.kafuidev.scinexus.model;

import java.time.LocalDateTime;

public class PostCategory {
    private Integer id;
    private String name;
    private String slug;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    public PostCategory(Integer id, String name, String slug, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public PostCategory setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public PostCategory setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public PostCategory setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public PostCategory setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    public Integer getId() {
        return id;
    }

}
