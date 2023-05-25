package externalLibrary;

public class DescargadorSpotifyProxy implements ServicioDescarga{
	
	private Usuario usuario;
	
	public DescargadorSpotifyProxy(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String descargar() {
		if (this.usuario.getTipoDeUsuario().equals(TipoDeUsuario.PREMIUM)) {
			DescargadorSpotify descargadorReal = new DescargadorSpotify();
			return descargadorReal.descargar();
		} else {
			return "No sea pobre";
		}
	}
}
