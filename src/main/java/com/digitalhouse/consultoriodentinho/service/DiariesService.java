package com.digitalhouse.consultoriodentinho.service;

import com.digitalhouse.consultoriodentinho.entity.Diaries;
import com.digitalhouse.consultoriodentinho.repository.DiariesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiariesService {

    private DiariesRepository diariesRepository;

    public DiariesService(DiariesRepository diariesRepository) {
        this.diariesRepository = diariesRepository;
    }

    public List<Diaries> findAll() {
        return diariesRepository.findAll();
    }

    public Diaries findById(Long id){
        return diariesRepository.findById(id).orElse(new Diaries());
    }

    public Diaries save(Diaries diaries){
        return diariesRepository.save(diaries);
    }

    public void deleteById(Long id){
        diariesRepository.deleteById(id);
    }
}