package com.example.telemedicina.dao;

import com.example.telemedicina.domain.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface PacienteDao extends CrudRepository<Paciente,Long> {


}
