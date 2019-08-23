package com.example.demo.repositories;

import com.example.demo.domain.Posts;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Posts, Long> {
}
