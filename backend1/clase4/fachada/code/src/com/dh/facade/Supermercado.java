package com.dh.facade;


import com.dh.facade.libreriasexternas.monserrattechsolutions.ApiTarjeta;
import com.dh.facade.model.Producto;
import com.dh.facade.model.Tarjeta;
import com.dh.facade.sistemadedescuentos.ApiDescuento;
import com.dh.facade.sistemadedescuentos.IApiDescuentos;

public class Supermercado {

    public static void main(String[] args) {
        IApiDescuentos sistemaDeDescuentos = new ApiDescuento();

        sistemaDeDescuentos.calcularPorcentajeDeDescuento(new Tarjeta("123", "Star Bank"), new Producto("pepsi", "lata"), 19);
    }
}
