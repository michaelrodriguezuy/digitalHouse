import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LiquidadorTest {

    @Test
    public void deberíaCalcularCorrectamenteParaElEmpleadoContratado(){
        //GIVEN
        EmpleadoContratado e = new EmpleadoContratado("Nero", "Nerón", "abc123", 10, 5);
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoContratado();
        int sueldoEsperado = 50;

        //WHEN
        int sueldoCalculado = sujetoDePrueba.calcularElSueldo(e);

        //THEN
        Assertions.assertTrue(sueldoCalculado == sueldoEsperado);
    }

    @Test
    public void deberíaCalcularCorrectamenteParaElEmpleadoEfectivo(){
        //GIVEN
        EmpleadoEfectivo e = new EmpleadoEfectivo("Nero", "Nerón", "abc123", 100);
        e.setBonos(10);
        e.setDescuentos(15);
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoEfectivo();
        int sueldoEsperado = 95;

        //WHEN
        int sueldoCalculado = sujetoDePrueba.calcularElSueldo(e);

        //THEN
        Assertions.assertTrue(sueldoCalculado == sueldoEsperado);
    }

    @Test
    public void deberíaRetornarUnValorNegativoCuandoElTipoDeEmpleadoNoEsElAdecuado(){
        //GIVEN
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoEfectivo();

        //WHEN
//        int sueldoCalculado = sujetoDePrueba.calcularElSueldo(e);

        //THEN
    }

}