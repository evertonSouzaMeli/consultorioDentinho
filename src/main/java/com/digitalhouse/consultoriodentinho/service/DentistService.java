package com.digitalhouse.consultoriodentinho.service;

import com.digitalhouse.consultoriodentinho.entity.Dentists;
import com.digitalhouse.consultoriodentinho.repository.DentistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistService {

    private DentistRepository dentistRepository;

    public DentistService(DentistRepository dentistRepository){
        this.dentistRepository = dentistRepository;
    }

    public List<Dentists> findAll() {
        return dentistRepository.findAll();
    }

    public Dentists save(Dentists dentists){
        return dentistRepository.save(dentists);
    }

    public Dentists findById(Long id){
        return dentistRepository.findById(id).orElse(new Dentists());
    }

    public void deleteById(Long id){
        dentistRepository.deleteById(id);
    }

}
