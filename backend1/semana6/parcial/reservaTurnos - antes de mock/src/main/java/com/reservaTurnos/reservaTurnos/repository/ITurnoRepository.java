package com.reservaTurnos.reservaTurnos.repository;

import com.reservaTurnos.reservaTurnos.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long> {

}
