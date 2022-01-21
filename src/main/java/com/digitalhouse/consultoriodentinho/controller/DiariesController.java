package com.digitalhouse.consultoriodentinho.controller;

import com.digitalhouse.consultoriodentinho.entity.Diaries;
import com.digitalhouse.consultoriodentinho.service.DiariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diaries")
public class DiariesController {

    @Autowired
    private DiariesService diariesService;

    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Diaries>> getAll(){
        return new ResponseEntity<>(diariesService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Diaries> getById(@PathVariable Long id){
        return new ResponseEntity<>(diariesService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<Diaries> post(@RequestBody Diaries diaries){
        return new ResponseEntity<>(diariesService.save(diaries), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<Diaries> put(@RequestBody Diaries diaries){
        return new ResponseEntity<>(diariesService.save(diaries), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        diariesService.deleteById(id);
    }
}

