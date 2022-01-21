package com.digitalhouse.consultoriodentinho.controller;

import com.digitalhouse.consultoriodentinho.entity.Turns;
import com.digitalhouse.consultoriodentinho.service.TurnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turns")
public class TurnsController {

    @Autowired
    private TurnsService turnService;

    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Turns>> getAll() {
        return new ResponseEntity<>(turnService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Turns> getById(@PathVariable Long id){
        return new ResponseEntity<>(turnService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<Turns> post(@RequestBody Turns turns) {
        return new ResponseEntity<>(turnService.save(turns), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<Turns> put(@RequestBody Turns turns){
        return new ResponseEntity<>(turnService.save(turns), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Long id){
        turnService.deleteById(id);
    }
}
