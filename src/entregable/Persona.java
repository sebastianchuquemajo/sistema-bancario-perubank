package entregable;

public class Persona {
    
    private String nombre;
    private String cuenta;
    private String contrasena;
    private double saldo;

    public Persona(String nombre, String cuenta, String contrasena, double saldoInicial) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contrasena = contrasena;
        this.saldo = saldoInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getContrasena() {
        return contrasena;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            return true;
        }
        return false;
    }

    public boolean retirar(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }
}