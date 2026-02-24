package com.kafuidev.scinexus.model;

import jakarta.validation.constraints.NotBlank;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public record Post(
        Integer id,
        @NotBlank String title,
        String subheading,
        String slug,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        Integer categoryId,
        String author,
        @NotBlank String content,
        Integer imagesListId
) {
}
