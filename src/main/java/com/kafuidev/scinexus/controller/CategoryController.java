package com.kafuidev.scinexus.controller;

import com.kafuidev.scinexus.model.category.Category;
import com.kafuidev.scinexus.repository.CategoryRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("api/categories/")
public class CategoryController {

    private final CategoryRepository categoryRepository;
    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Read operations
    @GetMapping("")
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable Integer id){
        return categoryRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found !"));
    }

    //Create
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody Category category){
        categoryRepository.save(category);
    }

    //Update
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Valid @RequestBody Category category, @PathVariable Integer id){
        if(categoryRepository.findById(id).isPresent()){
            categoryRepository.save(category);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found !");
        }
    }

    //Delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        if(categoryRepository.findById(id).isPresent()){
            categoryRepository.delete(id);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found !");
        }
    }



}
