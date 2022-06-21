package com.example.telranproject.controller;

import com.example.telranproject.model.Music;
import com.example.telranproject.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private MusicService service;


    @GetMapping("/")
    public ResponseEntity<List<Music>> list() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
