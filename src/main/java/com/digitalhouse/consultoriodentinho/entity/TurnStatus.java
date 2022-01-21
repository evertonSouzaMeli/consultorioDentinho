package com.digitalhouse.consultoriodentinho.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "turn_status")
public
class TurnStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTurnStatust;

    @Column(name="name")
    private String name;

    @Column(name="description", nullable = false)
    private String description;
}
