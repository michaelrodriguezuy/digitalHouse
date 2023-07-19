package com.reservaTurnos.reservaTurnos.repository;

import com.reservaTurnos.reservaTurnos.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente,Long> {

}
