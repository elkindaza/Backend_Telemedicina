package com.example.telemedicina.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="cita")
public class Cita {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cita;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;
    @Column(name = "hora")
    private LocalTime hora;

    private String estado;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name="fk_id_medico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name="fk_id_paciente")
    private Paciente paciente;
    @OneToMany(mappedBy = "cita")
    private List<Consulta> consulta;

}
