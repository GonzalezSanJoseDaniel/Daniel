package cuentas;

/**
 * Esta clase realiza operaciones de ingreso y retirada, además puede propocionar
 * información sobre el estado de la cuenta, y su tipo de interés.
 * @author 4a1da
 */

public class CCuenta {
    
/**
 * Aquí almacenamos los datos.
 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
           }

    /**
     * @return el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nombre a elegir.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta la cuenta a elegir.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el saldo a elegir.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés ajusta el tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
}
