package com.digitalhouse.consultoriodentinho.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Patients")
public class Patients {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long  idPatient;

   @Column(name = "name",nullable = false)
   private String name;

   @Column(name = "last_name", nullable = false)
   private String Lastname;

   @Column(name="address", nullable = false)
   private String adress;

   @Column(name = "dni")
   private String dni;

   @Column(name = "birth_date",nullable = false)
   private LocalDateTime birthDate;

   @Column(name = "phone",nullable = false)
   private String phone;

   @Column(name = "email")
   private String email;

   @OneToMany(mappedBy = "patients", cascade = CascadeType.ALL)
   private List<Turns> turns ;
}
