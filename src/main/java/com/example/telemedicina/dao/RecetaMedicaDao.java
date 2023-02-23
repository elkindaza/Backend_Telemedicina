package com.example.telemedicina.dao;

import com.example.telemedicina.domain.RecetaMedica;
import org.springframework.data.repository.CrudRepository;

public interface RecetaMedicaDao extends CrudRepository<RecetaMedica,Long> {
}
