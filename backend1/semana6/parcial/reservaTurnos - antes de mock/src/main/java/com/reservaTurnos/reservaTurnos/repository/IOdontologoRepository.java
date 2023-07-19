package com.reservaTurnos.reservaTurnos.repository;

import com.reservaTurnos.reservaTurnos.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo,Long> {

}
