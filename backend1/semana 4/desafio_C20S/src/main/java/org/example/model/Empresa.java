package org.example.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable {

    public Logger logger = LogManager.getLogger(Empresa.class);

    private String razonSocial;
    private Long CUIT;
    private List<Empleado> empledos = new ArrayList<>();



    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Long getCUIT() {
        return CUIT;
    }

    public void setCUIT(Long CUIT) {
        this.CUIT = CUIT;
    }

    public List<Empleado> getEmpledos() {
        return empledos;
    }

    public void setEmpledos(List<Empleado> empledos) {
        this.empledos = empledos;
    }

    public Empresa(String razonSocial, Long CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
    }
        }
