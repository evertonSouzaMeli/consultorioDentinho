package com.digitalhouse.consultoriodentinho.controller;

import com.digitalhouse.consultoriodentinho.entity.Patients;
import com.digitalhouse.consultoriodentinho.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientsController {
    
    @Autowired
    private PatientsService patientsService;
    
    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Patients>> getAll() {
        return new ResponseEntity<>(patientsService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Patients> getById(@PathVariable Long id){
        return new ResponseEntity<>(patientsService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<Patients> post(@RequestBody Patients patients) {
        return new ResponseEntity<>(patientsService.save(patients), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<Patients> put(@RequestBody Patients patients){
        return new ResponseEntity<>(patientsService.save(patients), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Long id){
        patientsService.deleteById(id);
    }
}
