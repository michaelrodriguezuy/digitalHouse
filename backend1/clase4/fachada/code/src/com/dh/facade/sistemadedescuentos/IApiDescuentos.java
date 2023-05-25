package com.dh.facade.sistemadedescuentos;

import com.dh.facade.model.Producto;
import com.dh.facade.model.Tarjeta;

public interface IApiDescuentos {
    public int calcularPorcentajeDeDescuento(Tarjeta t, Producto p, int cant);
}
