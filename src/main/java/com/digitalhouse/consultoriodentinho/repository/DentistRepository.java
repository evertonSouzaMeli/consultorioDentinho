package com.digitalhouse.consultoriodentinho.repository;

import com.digitalhouse.consultoriodentinho.entity.Dentists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentists, Long> {
}
