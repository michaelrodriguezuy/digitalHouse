package org.dh.c2023II.clinica.service;

import org.apache.log4j.Logger;
import org.dh.c2023II.clinica.model.Odontologo;
import org.dh.c2023II.clinica.model.Paciente;
import org.dh.c2023II.clinica.persistence.dao.IDao;
import org.dh.c2023II.clinica.persistence.dao.impl.OdontologoDao;

import java.util.List;

public class OdontologoService {
	IDao<Odontologo> odao = new OdontologoDao();

	Logger logger = Logger.getLogger(OdontologoService.class);

	public List<Odontologo> listarTodos() {
		return odao.findAll();
	}
	
	public Odontologo crear(Odontologo o) {
		if(o.getNombre() != null && !o.getNombre().isBlank()){
			logger.info("Se ha creado el odontolgo "+o.getNombre());
			return odao.save(o);
		}
		
		return null;
	}
	
	public Odontologo modificar(Odontologo o) {
		if(o.getId() != null){
			Odontologo oReal = odao.findById(o.getId());
			if(oReal != null){
				oReal.setNombre(o.getNombre());
				oReal.setNroDeMatricula(o.getNroDeMatricula());
				logger.info("El odontologo "+ o.getNombre()+ " se ha modificado con exito");
			}
			return oReal;
		}
		return null;
	}
	
	public Odontologo buscarPorId(Integer id) {
		logger.info("Se encontro el odontolgo "+ odao.findById(id).getNombre());
		return odao.findById(id);
	}
	
	public List<Odontologo> eliminarOdontologo(Integer id) {
		logger.info("El odontolgo "+ odao.findById(id).getNombre() + " se ha eliminado con exito!");
		return odao.delete(id);
	}
	
}
