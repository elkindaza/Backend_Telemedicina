package com.example.telemedicina.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "medico")
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_medico;
    private String nombre;
    private String apellido;
    private String direccion;
    private String numero_telefono;
    private String correo_electronico;
    private String genero;
    private String fecha_nacimiento;
    private String cedula_ciudadania;
    private String especialidad;
    private String numero_tarjeta_profesional;

    @OneToMany(mappedBy = "medico")
    private List<RecetaMedica> recetaMedica;

    @OneToMany(mappedBy = "medico")
    private List<Cita> cita;

    @OneToMany(mappedBy = "medico")
    private List<Consulta> consulta;

}
