package com.digitalhouse.consultoriodentinho.controller;

import com.digitalhouse.consultoriodentinho.entity.TurnStatus;
import com.digitalhouse.consultoriodentinho.service.TurnStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnStatus")
public class TurnStatusController {

    @Autowired
    private TurnStatusService turnStatusService;

    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<TurnStatus>> getAll() {
        return new ResponseEntity<>(turnStatusService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<TurnStatus> getById(@PathVariable Long id){
        return new ResponseEntity<>(turnStatusService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<TurnStatus> post(@RequestBody TurnStatus turnStatus) {
        return new ResponseEntity<>(turnStatusService.save(turnStatus), HttpStatus.CREATED);
    }

    @PutMapping("/put")
    public ResponseEntity<TurnStatus> put(@RequestBody TurnStatus turnStatus){
        return new ResponseEntity<>(turnStatusService.save(turnStatus), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable Long id){
        turnStatusService.deleteById(id);
    }
}
