package com.digitalhouse.consultoriodentinho.repository;

import com.digitalhouse.consultoriodentinho.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepository extends JpaRepository<Patients,Long> {
}
