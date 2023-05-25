
public class CajaAhorro extends Cuenta {

	public static final double INTERES_CAJA_AHORRO = 1.2;

	//sobreescritura
	@Override
	public void depositar(double monto){
		if (monto > 600000){
			System.out.println("No se pudo depositar por que no se de donde sacaste la plata");
			super.depositar(0);
		}else{
			super.depositar(monto);
		}
	}


	// depositar en otro tipo de moneda que no sea el peso.
	//sobrecarga
	public void depositar(double monto, int tipoCambio){
		Double montoADepositar = monto * tipoCambio;
		super.depositar(montoADepositar);
	}

	
	@Override
	public void extraer(double monto) {
		if(informarSaldo() <= monto)
			setSaldo(informarSaldo() - monto);
		
	}
	public void cobrarIntereses() {
		setSaldo(informarSaldo() * CajaAhorro.INTERES_CAJA_AHORRO);
	}

	@Override
	public String toString() {
		return "CajaAhorro{}";
	}
}
