package Concesionario;

public abstract class Vehiculo {
    public String patente;
    public String marca;
    public String modelo;
    public double consumo;
    public double precio;
    public Integer ruedas;

    public Vehiculo(String patente, String marca, String modelo, double consumo, double precio, Integer ruedas) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.precio = precio;
        this.ruedas = ruedas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }
}
