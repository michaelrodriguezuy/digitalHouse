package externalLibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescargadorSpotifyProxyTest {

	@Test
	public void debeBajarCorrectamenteUnaCancionPorUserPremium() {
		Usuario usuarioPremium = new Usuario(TipoDeUsuario.PREMIUM, 1);
		ServicioDescarga descargador = new DescargadorSpotifyProxy(usuarioPremium);
		String resultado = descargador.descargar();
		Assertions.assertEquals(resultado, "tomá tu canción");
	}
	
	@Test
	public void debeRechazarPorPobre() {
		Usuario usuarioFree = new Usuario(TipoDeUsuario.FREE, 1);
		ServicioDescarga descargador = new DescargadorSpotifyProxy(usuarioFree);
		String resultado = descargador.descargar();
		Assertions.assertEquals(resultado, "No sea pobre");
	}
}