package com.kafuidev.scinexus.repository;

import com.kafuidev.scinexus.model.PostCategory;

import java.util.List;
import java.util.Optional;

public class PostCategoryRepository {

    private List<PostCategory> postCategoryList;

    public List<PostCategory> getPostCategoryList() {return postCategoryList;}

    public Optional<PostCategory> getPostCategoryById(Integer id) {
        return postCategoryList.stream().filter(pc -> pc.getId().equals(id)).findFirst();
    }
}
