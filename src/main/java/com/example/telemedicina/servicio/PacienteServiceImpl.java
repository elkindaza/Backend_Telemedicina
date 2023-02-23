package com.example.telemedicina.servicio;

import com.example.telemedicina.dao.PacienteDao;
import com.example.telemedicina.domain.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteDao pacienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> listarPacientes() {
        return (List<Paciente>) pacienteDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Paciente paciente) {
        pacienteDao.save(paciente);
    }

    @Override
    @Transactional
    public void eliminar(Paciente paciente) {
        pacienteDao.delete(paciente);
    }

    @Override
    @Transactional(readOnly = true)
    public Paciente encontrarPaciente(Paciente paciente) {
        return pacienteDao.findById(paciente.getId_paciente()).orElse(null);

    }
}
