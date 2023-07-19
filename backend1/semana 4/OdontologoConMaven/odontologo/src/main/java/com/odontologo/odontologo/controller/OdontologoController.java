package com.odontologo.odontologo.controller;

import com.odontologo.odontologo.models.Odontologo;
import com.odontologo.odontologo.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OdontologoController {

    @Autowired
    private final OdontologoService odontologoService;

    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @GetMapping("/odontologos")
    public List<Odontologo> listarOdontologo() {
        return odontologoService.listarOdontologos();
    }

}
