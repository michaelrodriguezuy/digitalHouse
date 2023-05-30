public class Cuenta {
    private int IdUsuario;
    private String password;
    private double saldoActual;

    public int getIdUsuario() {
        return IdUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta(int idUsuario, String password, double saldoActual) {
        IdUsuario = idUsuario;
        this.password = password;
        this.saldoActual = saldoActual;
    }
}
