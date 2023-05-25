package externalLibrary;

public class Usuario {
	
	private TipoDeUsuario tipoDeUsuario;
	private Integer id;
	
	public Usuario(TipoDeUsuario tipoDeUsuario, Integer id) {
		this.tipoDeUsuario = tipoDeUsuario;
		this.id = id;
	}
	
	public Enum getTipoDeUsuario() {
		return tipoDeUsuario;
	}
	
	public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
		this.tipoDeUsuario = tipoDeUsuario;
	}
	
	public Integer getId() {
		return id;
	}
	
}
