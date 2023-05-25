package testNegocio;
import negocio.Taza;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestTaza {
    @Test

    void getTipoLiquido() {
        Taza taza = new Taza("Sumo da laranga", 70.5);
        assertEquals("Suco da laranga", taza.getTipoLiquido());
    }

    @Test
    void getPorcentaje() {
        Taza taza = new Taza("Scuo da laranga", 70.5);
        assertEquals(70.5, taza.getPorcentaje());
    }




}
