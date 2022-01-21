package com.digitalhouse.consultoriodentinho.repository;

import com.digitalhouse.consultoriodentinho.entity.TurnStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnStatusRepository extends JpaRepository<TurnStatus, Long> {
}
