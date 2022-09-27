package com.programmer.JobPosting.controller;

import com.programmer.JobPosting.model.Post;
import com.programmer.JobPosting.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    PostRepo repo;

    @ApiIgnore
    @RequestMapping(value = "/")
//    How to enable the swaggers
    public void enableSwagger(HttpServletResponse response) throws IOException { // every time someone sends the request to the home page, it we should redirect to the swagger page. to do that we need to import HttpServeletResponse
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPost(){
        return repo.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }
    @DeleteMapping("/deletepPosts/{postsId}")
    public ResponseEntity<?> deletePosts(@PathVariable(value = "postsId") String id) {
        // Access the DB and delete the order
        repo.deleteById(id);
        return new ResponseEntity<>("Successfully Deleted",HttpStatus.OK);
    }

    @PutMapping("/putPosts/{postsId}")
    public ResponseEntity<?> updatePosts(@PathVariable (value = "postsId") String id,@RequestBody Post post) {
        Optional<Post> updatePosts = repo.findById(id);
        if(updatePosts.isPresent()){
            Post post1 = updatePosts.get();
            post1.setDesc(post.getDesc());
            post1.setExp(post.getExp());
            post1.setProfiles(post.getProfiles());
            post1.setLocation(post.getLocation());
            post1.setTechs(post.getTechs());
            repo.save(post1);
            return new ResponseEntity<>(post1,HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Job expired",HttpStatus.OK);
        }

    }

}
