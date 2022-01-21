package com.digitalhouse.consultoriodentinho.service;

import com.digitalhouse.consultoriodentinho.entity.TurnStatus;
import com.digitalhouse.consultoriodentinho.repository.TurnStatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnStatusService {

    private TurnStatusRepository turnStatusRepository;


    public TurnStatusService(TurnStatusRepository turnStatusRepository){
        this.turnStatusRepository = turnStatusRepository;
    }


    public List<TurnStatus> findAll() {
        return turnStatusRepository.findAll();
    }

    public TurnStatus findById(Long id){
        return turnStatusRepository.findById(id).orElse(new TurnStatus());
    }

    public TurnStatus save(TurnStatus turnStatus){
        return turnStatusRepository.save(turnStatus);
    }

    public void deleteById(Long id){
        turnStatusRepository.deleteById(id);
    }






}
