package com.example.telranproject.repo;

import com.example.telranproject.model.Music;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;

public interface MusicRepo extends MongoRepository<Music, String> {

}
