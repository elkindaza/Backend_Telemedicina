package com.example.telemedicina.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="consulta")
public class Consulta {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_consulta;

    private Date fecha;
    private String sintomas;
    private String diagnostico;
    private String tratamiento;
    private String notas_adicionales;

    @ManyToOne
    @JoinColumn(name="fk_id_cita_consulta")
    private Cita cita;
    @ManyToOne
    @JoinColumn(name="fk_id_paciente_consulta")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name="fk_id_medico_consulta")
    private Medico medico;
    @ManyToOne
    @JoinColumn(name="fk_id_pagos_consulta")
    private Pagos pagos;

}
