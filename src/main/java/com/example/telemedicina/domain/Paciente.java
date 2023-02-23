package com.example.telemedicina.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "paciente")
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_paciente;

@NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String direccion;
    @NotEmpty
    private String numero_telefono;
    @NotEmpty
    @Email
    private String correo_electronico;
    @NotEmpty
    private String genero;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nacimiento;
    private String cedula_ciudadania;
    private String eps;

    @OneToMany(mappedBy = "paciente")
    private List<HistorialMedico> historialMedicos;
    @OneToMany(mappedBy = "paciente")
    private List<Cita> cita;
    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consulta;
    @OneToMany(mappedBy = "paciente")
    private List<RecetaMedica> receta_medica;
}

