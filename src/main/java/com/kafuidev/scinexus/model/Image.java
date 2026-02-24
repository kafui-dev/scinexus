package com.kafuidev.scinexus.model;

import java.time.LocalDateTime;

public class Image {
    private long id;
    private String altText;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private boolean isFeatured;

    public String getAltText() {
        return altText;
    }

    public Image setAltText(String altText) {
        this.altText = altText;
        return this;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public Image setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public Image setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public Image setFeatured(boolean featured) {
        isFeatured = featured;
        return this;
    }
}
