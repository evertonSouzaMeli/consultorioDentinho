package com.digitalhouse.consultoriodentinho.repository;

import com.digitalhouse.consultoriodentinho.entity.Turns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnsRepository extends JpaRepository <Turns, Long> {
}
