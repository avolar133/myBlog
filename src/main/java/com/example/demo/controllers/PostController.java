package com.example.demo.controllers;


import com.example.demo.domain.Post;
import com.example.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//rest controller does not working
@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public void setPostService(PostService postService){
        this.postService = postService;
    }

    @GetMapping("/posts")
    private List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    private Post getPost(@PathVariable("id") Long id){
        return postService.getPostById(id);
    }

    /*
    @GetMapping("/post/{id}")
    public String post(@PathVariable("id") Long id, Model model){
        //Long num = new Long(1);
        model.addAttribute("text",postService.getPostById(id));
        return "forward:/post";
    }
    */

    //The address that you type in
    @GetMapping("/sandbox")
    public String listPosts(Model model){
        //s must be equal to the var in the template
        model.addAttribute("posts", postService.getAllPosts());

        // your template reference
        return "sandbox";
    }


}
