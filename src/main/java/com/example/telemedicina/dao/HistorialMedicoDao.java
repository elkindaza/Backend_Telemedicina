package com.example.telemedicina.dao;

import com.example.telemedicina.domain.HistorialMedico;
import org.springframework.data.repository.CrudRepository;

public interface HistorialMedicoDao extends CrudRepository<HistorialMedico,Long> {
}
