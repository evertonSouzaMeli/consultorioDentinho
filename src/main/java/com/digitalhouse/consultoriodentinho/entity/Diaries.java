package com.digitalhouse.consultoriodentinho.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "diarys")
public class Diaries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDiarys;

    @Column(name = "startTime", nullable = false)
    private LocalDateTime starTime;

    @Column(name = "endingTime", nullable = false)
    private LocalDateTime endingTime;

    @ManyToOne
    @JoinColumn(name = "id_dentist")
    private Dentists dentists;
}
