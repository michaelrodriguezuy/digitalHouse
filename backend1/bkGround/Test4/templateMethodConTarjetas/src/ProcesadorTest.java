import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class ProcesadorTest {

  @Test
    public void deberiaPoderComprarConTC() {
      //Given
      TarjetaCredito tc = new TarjetaCredito("312836128736128736",1234, LocalDate.parse("2024-04-29"),10000,5000);
      Procesador procesaCredito = new ProcesadorCredito();

      //lo que deberia de pasar con los datos que tengo
      boolean resultadoEsperado= true;

      //when
      boolean pudoComprar =  procesaCredito.procesarPago(tc,5000);

      //then
      Assertions.assertTrue(pudoComprar==resultadoEsperado);
  }

  @Test
  public void deberiaPoderComprarConTD() {
    //Given
    Tarjeta td = new TarjetaDebito("43234543454543",4321,LocalDate.parse("2023-12-30"),6000);;
    Procesador procesaDebito = new ProcesadorDebito();

    //lo que deberia de pasar con los datos que tengo
    boolean resultadoEsperado= true;

    //when
    boolean pudoComprar =  procesaDebito.procesarPago(td,5999);

    //then
    Assertions.assertTrue(pudoComprar==resultadoEsperado);
  }
}