package com.digitalhouse.consultoriodentinho.controller;

import com.digitalhouse.consultoriodentinho.entity.Dentists;
import com.digitalhouse.consultoriodentinho.service.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentists")
public class DentistsController {

    @Autowired
    private DentistService dentistService;

    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Dentists>> getAll() {
        return new ResponseEntity<>(dentistService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Dentists> getById(@PathVariable Long id){
        return new ResponseEntity<>(dentistService.findById(id), HttpStatus.OK);
    }
    
    @PostMapping("/post")
    public ResponseEntity<Dentists> post(@RequestBody Dentists dentists){
        return new ResponseEntity<>(dentistService.save(dentists), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<Dentists> put(@RequestBody Dentists dentists){
        return new ResponseEntity<>(dentistService.save(dentists), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        dentistService.deleteById(id);
    }
}
