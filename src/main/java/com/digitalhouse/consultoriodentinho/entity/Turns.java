package com.digitalhouse.consultoriodentinho.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "turns")
public class Turns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_turn")
    private Long id;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @Column(name = "day")
    private LocalDate day;

    @ManyToOne
    @JoinColumn(name = "id_diary")
    private Diaries diarys;

    @ManyToOne
    @JoinColumn(name = "id_patient")
    private Patients patients;

    @ManyToOne
    @JoinColumn(name = "id_turn_status")
    private TurnStatus turnStatus;
}
