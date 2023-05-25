
public class CuentaCorriente extends Cuenta implements ImpuestoGravable, Comparable {
	//primero va la herencia y duespues las interfaces
	private double descubiertoPermitido;
	
	

	public double getDescubiertoPermitido() {
		return descubiertoPermitido;
	}



	public void setDescubiertoPermitido(double descubiertoPermitido) {
		this.descubiertoPermitido = descubiertoPermitido;
	}


	public Double gravarImpuesto(Double porcentaje){
		Double montoADescontar = (this.informarSaldo() * porcentaje);
		super.setSaldo(this.informarSaldo() - montoADescontar);
		return montoADescontar;
	}

	@Override
	public int compareTo(Object o) {
		CuentaCorriente cuentaXParametro = ((CuentaCorriente) o);
		if(this.informarSaldo() > cuentaXParametro.informarSaldo()){
			return 1;
		}else{
			if(this.informarSaldo() < cuentaXParametro.informarSaldo()){
				return -1;
			}
		} return 0;
	}

	@Override
	public void extraer(double monto) {
		if(informarSaldo() + descubiertoPermitido <= monto)
			setSaldo(informarSaldo() - monto);
	}


}
