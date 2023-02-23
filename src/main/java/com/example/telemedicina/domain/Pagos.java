package com.example.telemedicina.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="pagos")
public class Pagos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pagos;

    private Date fecha;
    private double iva;
    private String metodo_de_pago;
    private String estado;
    private String comentarios;
    private double total;
    @OneToMany(mappedBy = "pagos")
    private List<Consulta> consulta;

}
