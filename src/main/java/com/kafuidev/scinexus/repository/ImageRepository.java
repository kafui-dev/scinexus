package com.kafuidev.scinexus.repository;

import com.kafuidev.scinexus.model.image.Image;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ImageRepository {

    private final List<Image> imagesList = new ArrayList<>();

    public ImageRepository() {}

    public List<Image> findAll() {
        return imagesList;
    }

    public Optional<Image> findById(Integer id) {
        return imagesList.stream().filter(image -> image.id().equals(id)).findFirst();
    }

    public void save(Image image) {
        imagesList.removeIf(image1 -> image1.id().equals(image.id()));
        imagesList.add(image);
    }

    @PostConstruct
    public void init() {
        imagesList.add(new Image(1, "First Image Alt Text", LocalDateTime.now(), null, true));
        imagesList.add(new Image(2, "Second Image Alt Text", LocalDateTime.now(), null, false));
    }

    public void delete(Integer id) {
        imagesList.removeIf(image -> image.id().equals(id));
    }
}
