package com.example.telemedicina.servicio;

import com.example.telemedicina.domain.Cita;

import java.util.List;

public interface MedicoService {
    public List<Cita> listarCita();

    public void guardar(Cita cita);

    public void eliminar(Cita cita);
    public Cita encontrarCita(Cita cita);
}
