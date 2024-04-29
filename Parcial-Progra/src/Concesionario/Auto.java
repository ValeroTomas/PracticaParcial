package Concesionario;

import java.util.Objects;

public class Auto extends Vehiculo{

    public String caja;
    public String listaDePrestaciones;


    public Auto(String patente, String marca, String modelo, double consumo, double precio, Integer ruedas, String caja, String listaDePrestaciones) {
        super(patente, marca, modelo, consumo, precio, ruedas);
        this.listaDePrestaciones = listaDePrestaciones;
        this.caja = caja;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getListaDePrestaciones() {
        return listaDePrestaciones;
    }

    public void setListaDePrestaciones(String listaDePrestaciones) {
        this.listaDePrestaciones = listaDePrestaciones;
    }

    @Override
    public String toString() {
        return  "\nAuto" +
                "\nCaja= " + caja +
                "\nPrestaciones ='" + listaDePrestaciones + '\'' +
                "\nPatente= '" + patente + '\'' +
                "\nMarca= '" + marca + '\'' +
                "\nModelo= '" + modelo + '\'' +
                "\nConsumo= " + consumo +
                "\nPrecio= " + precio +
                "\nRuedas= " + ruedas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(caja, auto.caja) && Objects.equals(listaDePrestaciones, auto.listaDePrestaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caja, listaDePrestaciones);
    }
}
