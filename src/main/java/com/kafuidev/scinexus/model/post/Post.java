package com.kafuidev.scinexus.model.post;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public record Post(
        Integer id,
        @NotBlank String title,
        String subheading,
        String slug,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        List<Integer> categoriesIdsList,
        String author,
        @NotBlank String content,
        List<Integer> imagesIdsList
) {
}
