package com.digitalhouse.consultoriodentinho.repository;

import com.digitalhouse.consultoriodentinho.entity.Diaries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiariesRepository extends JpaRepository <Diaries, Long> {
}
