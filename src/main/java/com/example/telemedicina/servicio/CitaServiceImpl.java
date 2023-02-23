package com.example.telemedicina.servicio;

import com.example.telemedicina.dao.CitaDao;
import com.example.telemedicina.dao.PacienteDao;
import com.example.telemedicina.domain.Cita;
import com.example.telemedicina.domain.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao citaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cita> listarCita() {
        return (List<Cita>) citaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Cita cita) {
        citaDao.save(cita);
    }

    @Override
    @Transactional
    public void eliminar(Cita cita) {
        citaDao.delete(cita);
    }

    @Override
    @Transactional(readOnly = true)
    public Cita encontrarCita(Cita cita) {
        return citaDao.findById(cita.getId_cita()).orElse(null);

    }
}
