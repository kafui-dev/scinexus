package com.kafuidev.scinexus.model.image;

import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public record Image(
        Integer id,
        @NotBlank String altText,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        boolean isFeatured
) {
}
