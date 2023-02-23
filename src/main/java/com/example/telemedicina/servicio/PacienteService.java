package com.example.telemedicina.servicio;

import com.example.telemedicina.domain.Paciente;

import java.util.List;

public interface PacienteService {


    public List<Paciente> listarPacientes();

    public void guardar(Paciente paciente);

    public void eliminar(Paciente paciente);
    public Paciente encontrarPaciente(Paciente paciente);


}
