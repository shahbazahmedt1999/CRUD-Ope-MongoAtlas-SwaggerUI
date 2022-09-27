package com.programmer.JobPosting.repository;

import com.programmer.JobPosting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository <Post,String> {

}
