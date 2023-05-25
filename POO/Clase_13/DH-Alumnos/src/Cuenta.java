
public abstract class Cuenta {
	
	private double saldo;
	//esto es un constructor vacio el cual ya viene por defecto en las clases de java. Se hereda de la calse object




	public Cuenta(){
	}

	public void depositar(double monto) {
		saldo += monto;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double informarSaldo() {
		return saldo;
	}

	public abstract void extraer(double monto);

	@Override
	public String toString() {
		return "Cuenta Padre{" +
				"saldo=" + saldo +
				'}';
	}
}
