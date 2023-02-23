package com.example.telemedicina.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="receta_medica")
public class RecetaMedica {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_receta_medica;

    private String medicamentos;
    private String dosis;
    private String duracion;
    private String instrucciones;

    @ManyToOne
    @JoinColumn(name="fk_id_medico_receta")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name="fk_id_paciente_receta")
    private Paciente paciente;


}
