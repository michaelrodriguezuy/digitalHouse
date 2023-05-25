package com.dh.proxyexample.libreriaexterna;

import java.time.LocalDate;

public final class RegistradorDeVacunasReal implements RegistradorDeVacunas{
    @Override
    public void vacunar(Paciente p) {
        System.out.println("Se ha vacunado el paciente " + p.getNombre() + " el día " + LocalDate.now() + ".");
    }
}
