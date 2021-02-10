package cuentas;

/**
 * Comentario de cabecera de la clase. Aquí se explica el funcionamiento de 
 * la clase. Es el archivo proporcionado por el enunciado de la tarea. Aquí
 * agrego comentarios. 
 *  
 * @author Radomir Dimitrov Atanasov
 * @version 1.0
 * @since 1.0
 *
 */
public class CCuenta {

	/**
	 * Atributos de la clase CCuenta
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor de la clase CCuenta. Inicializa el valor de los atributos
     * a su valor por defecto.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta. Este constructor recibe 4 parámetros
     * y usa 3 de ellos para inicializar 3 de los 4 atributos de la clase.
     * 
     * @param nom Nombre
     * @param cue Cuenta 
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Método que devuelve el estado de la cuenta (su saldo)
     * 
     * @return double El valor devuelto por el metodo getSaldo()
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que ingresa una cantidad en la cuenta
     * 
     * @param cantidad double La cantidad que se quiere ingresar
     * @throws Exception En caso de que se quiera ingresar una cantidad negativa
     * se lanza una excepcion y se informa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad de la cuenta
     * 
     * @param cantidad double La cantidad que se quiere retirar
     * @throws Exception se lanza una u otra excepción en funcion del valor del
     * parametro cantidad (si es menor o igual 0) o el estado de la cuenta 
     * (estado() menor que cantidad, es decir hay menos dinero del que se quiere retirar)
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método get para el atributo nombre 
     * 
     * @return String el valor del atributo nombre
     */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para cambiar el valor del atributo nombre
	 * 
	 * @param nombre nuevo valor del atributo nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    /**
     * Método get para el atributo cuenta 
     * 
     * @return String el valor del atributo cuenta
     */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Método para cambiar el valor del atributo cuenta
	 * 
	 * @param cuenta nombre del nuevo valor del atributo cuenta.
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

    /**
     * Método get para el atributo saldo 
     * 
     * @return double el valor del atributo saldo
     */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método para cambiar el valor del atributo saldo
	 * 
	 * @param saldo nuevo valor del atributo saldo.
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    /**
     * Método get para el atributo tipoInteres 
     * 
     * @return double el valor del atributo tipoInteres
     */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Método para cambiar el valor del atributo tipoInteres
	 * 
	 * @param tipoInteres nuevo valor del atributo tipoInteres.
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
