package com.dh.facade.sistemadedescuentos;

import com.dh.facade.libreriasexternas.monserrattechsolutions.ApiTarjeta;
import com.dh.facade.libreriasexternas.apiarisconsulting.ApiCantidad;
import com.dh.facade.libreriasexternas.compumundohipermegalanisnet.ApiProducto;
import com.dh.facade.model.Producto;
import com.dh.facade.model.Tarjeta;

public class ApiDescuento implements IApiDescuentos{ //Esta es la fachada

        // guarda en las variables una instancia de cada otra
        private ApiTarjeta apiTarjeta;
        private ApiProducto apiProducto;
        private ApiCantidad apiCantidad;

        // constructor que crea las instancias
        public ApiDescuento() {
            apiTarjeta  = new ApiTarjeta() ;
            apiProducto = new ApiProducto() ;
            apiCantidad = new ApiCantidad() ;
        }

        //  simplifica el descuento
        @Override
        public int calcularPorcentajeDeDescuento(Tarjeta t, Producto p, int cant) {
            int elDescuento = 0;
            elDescuento = elDescuento + apiCantidad.obtenerPorcentajeDeDescuento(cant);
            elDescuento = elDescuento + apiProducto.obtenerPorcentajeDeDescuentoPorTipoDeProducto(p);
            elDescuento = elDescuento + apiTarjeta.obtenerPorcentajeDeDescuentoPorBanco(t);
            return elDescuento;
        }

}
