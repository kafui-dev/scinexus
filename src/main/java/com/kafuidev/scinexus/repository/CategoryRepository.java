package com.kafuidev.scinexus.repository;

import com.kafuidev.scinexus.model.category.Category;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    private final List<Category> categoryList = new ArrayList<>();

    public CategoryRepository() {
    }

    @PostConstruct
    public void init(){
        Category category = new Category(
                1,
                "Personal Development",
                "devpers",
                LocalDateTime.now(),
                null
        );
        categoryList.add(category);
    }

    public List<Category> findAll() {
        return categoryList;
    }

    public Optional<Category> findById(Integer id) {
        return categoryList.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public void save(Category category) {
        categoryList.removeIf(c -> c.getId().equals(category.getId()));
        categoryList.add(category);
    }

    public void delete(Integer id) {
        categoryList.removeIf(c -> c.getId().equals(id));
    }
}
