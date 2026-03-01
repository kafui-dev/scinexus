package com.kafuidev.scinexus.model.post;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Post(
        @Id
        Integer id,
        @NotBlank String title,
        String subheading,
        String slug,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String category,
        String author,
        @NotBlank String content,
        String imageUrl
) {
}
