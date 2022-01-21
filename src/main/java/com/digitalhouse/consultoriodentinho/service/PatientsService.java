package com.digitalhouse.consultoriodentinho.service;

import com.digitalhouse.consultoriodentinho.entity.Patients;
import com.digitalhouse.consultoriodentinho.repository.PatientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientsService {

    private PatientsRepository patientsRepository;

    public PatientsService(PatientsRepository patientsRepository){
        this.patientsRepository = patientsRepository;
    }

    public List<Patients> findAll() {
        return patientsRepository.findAll();
    }

    public Patients findById(Long id) {
        return patientsRepository.findById(id).orElse(new Patients());
    }
    public Patients save(Patients patient)
    {
       return patientsRepository.save(patient);
    }

    public void deleteById(Long id)
    {
        patientsRepository.deleteById(id);
    }
}
