package com.example.telemedicina.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "historial_medico")
public class HistorialMedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_historial_medico;
    private String enfermedades_anteriores;
    private String alergias;
    private String notas;
    private String medicamentos_anteriores;

    @ManyToOne
    @JoinColumn(name="fk_id_paciente_historial_medico")
    private Paciente paciente;

}