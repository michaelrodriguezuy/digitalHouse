package com.dh.proxyexample.app.proxy;

import com.dh.proxyexample.libreriaexterna.Paciente;
import com.dh.proxyexample.libreriaexterna.RegistradorDeVacunas;
import com.dh.proxyexample.libreriaexterna.RegistradorDeVacunasReal;

import java.time.LocalDate;

public class RegistradorDeVacunaProxy implements RegistradorDeVacunas {
    
    @Override
    public void vacunar(Paciente p) {
        if(esValidaLaFecha(p.getFechaDeVacunación())){
            RegistradorDeVacunasReal sujetoReal = new RegistradorDeVacunasReal();
            sujetoReal.vacunar(p);
        }else{
            System.out.println("El paciente no se pudo vacunar.");
        }
    }

    private boolean esValidaLaFecha(LocalDate fechaDeVacunación) {
        LocalDate fechaDeHoy = LocalDate.now();
        return fechaDeVacunación.isEqual(fechaDeHoy) || fechaDeVacunación.isBefore(fechaDeHoy);
    }
}
