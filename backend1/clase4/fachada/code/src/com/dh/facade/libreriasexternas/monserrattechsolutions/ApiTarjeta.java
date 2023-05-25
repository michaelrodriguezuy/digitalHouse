package com.dh.facade.libreriasexternas.monserrattechsolutions;

import com.dh.facade.model.Tarjeta;

public class ApiTarjeta {

    public int obtenerPorcentajeDeDescuentoPorBanco(Tarjeta t){
        return t.getBanco().equalsIgnoreCase("star bank") ? 20 : 0;
    }
}
