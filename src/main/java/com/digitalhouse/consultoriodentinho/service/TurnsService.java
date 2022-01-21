package com.digitalhouse.consultoriodentinho.service;

import com.digitalhouse.consultoriodentinho.entity.Turns;
import com.digitalhouse.consultoriodentinho.repository.TurnsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnsService {

    private TurnsRepository turnsRepository;

    public TurnsService(TurnsRepository turnsRepository) {
        this.turnsRepository = turnsRepository;
    }

    public List<Turns> findAll(){
        return turnsRepository.findAll();
    }

    public Turns findById(Long id) {
        return turnsRepository.findById(id).orElse(new Turns());
    }

    public Turns save(Turns turns)
    {
        return turnsRepository.save(turns);
    }

    public void deleteById(Long id) {
        turnsRepository.deleteById(id);
    }

}
