package Concesionario;

import java.util.Objects;

public class Auto extends Vehiculo{

    public Integer caja;
    public String listaDePrestaciones;


    public Auto(String patente, String marca, String modelo, double consumo, double precio, Integer ruedas, Integer caja, String listaDePrestaciones) {
        super(patente, marca, modelo, consumo, precio, ruedas);
        this.caja = caja;
        this.listaDePrestaciones = listaDePrestaciones;
    }

    public Integer getCaja() {
        return caja;
    }

    public void setCaja(Integer caja) {
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
        return "Auto{" +
                "caja=" + caja +
                ", listaDePrestaciones='" + listaDePrestaciones + '\'' +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", precio=" + precio +
                ", ruedas=" + ruedas +
                '}';
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
