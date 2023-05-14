package com.zjy.server.controller;

import com.zjy.model.domain.Main;
import com.zjy.server.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping
    public ResponseEntity findWords(String str){

        List<Main> words = mainService.findWords(str);
        System.out.println("------"+ words);
        return ResponseEntity.ok(words);
    }
}
