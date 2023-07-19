package org.dh.c2023II.clinica.controller;

import org.apache.log4j.Logger;
import org.dh.c2023II.clinica.model.Odontologo;
import org.dh.c2023II.clinica.service.OdontologoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OdontologoController implements IController<Odontologo>{

	Logger logger = Logger.getLogger(PacienteController.class);
	OdontologoService oservice = new OdontologoService();
	
	
	@Override
	@GetMapping("/odontologos")
	public List<Odontologo> listarTodos() {
		return oservice.listarTodos();
	}
	
	@GetMapping("/odontologos/{id}")
	public Odontologo listarOdontologoPorId(@PathVariable Integer id) {
		return oservice.buscarPorId(id);
	}
	
	@PostMapping("/odontologos")
	public Odontologo agregarOdontologo(@RequestBody Odontologo o) {
		return oservice.crear(o);
	}
	
	@PutMapping("/odontologos")
	public Odontologo modificarOdontologo(@RequestBody Odontologo o) {
		return oservice.modificar(o);
	}
	
	@DeleteMapping("/odontologos/{id}")
	public List<Odontologo> eliminarOdontologo(@PathVariable Integer id) {
		return oservice.eliminarOdontologo(id);
	}
	
}
