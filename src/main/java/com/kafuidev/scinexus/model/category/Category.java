package com.kafuidev.scinexus.model.category;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class Category {
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    private String slug;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    public Category() {
    }

    public Category(Integer id, String name, String slug, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public Category setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public Category setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public Category setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Category setId(Integer id) {
        this.id = id;
        return this;
    }

}
