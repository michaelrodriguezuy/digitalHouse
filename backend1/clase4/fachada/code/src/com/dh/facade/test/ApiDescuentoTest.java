package com.dh.facade.test;

import com.dh.facade.model.Producto;
import com.dh.facade.model.Tarjeta;
import com.dh.facade.sistemadedescuentos.ApiDescuento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApiDescuentoTest {

    @Test
    void calcularPorcentajeDeDescuento_deberíaAplicarElDescuentoPorTarjeta() {
        //DADOS
        ApiDescuento sujetoDePrueba = new ApiDescuento();
        Tarjeta tarjeta = new Tarjeta("33443344223433", "Star Bank");
        Producto producto = new Producto("café", "bolsa");
        int cantidad = 3;
        int descuentoEsperado = 20;

        //CUANDO
        int descuencoObtenido = sujetoDePrueba.calcularPorcentajeDeDescuento(tarjeta, producto, cantidad);

        //ENTONCES
        Assertions.assertEquals(descuentoEsperado, descuencoObtenido);
        Assertions.assertTrue(descuentoEsperado == descuencoObtenido);
    }
}