package com.example.telemedicina.dao;

import com.example.telemedicina.domain.Medico;
import org.springframework.data.repository.CrudRepository;

public interface MedicoDao extends CrudRepository<Medico,Long> {

}
