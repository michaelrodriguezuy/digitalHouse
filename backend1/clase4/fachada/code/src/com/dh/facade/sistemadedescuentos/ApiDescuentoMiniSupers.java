package com.dh.facade.sistemadedescuentos;

import com.dh.facade.model.Producto;
import com.dh.facade.model.Tarjeta;

public class ApiDescuentoMiniSupers implements IApiDescuentos{
    @Override
    public int calcularPorcentajeDeDescuento(Tarjeta t, Producto p, int cant) {
        //Implemento una Cadena de Responsabilidad para aplicar los descuentos.
        return 0;
    }
}
