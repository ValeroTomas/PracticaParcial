package Concesionario;

import java.util.Objects;

public class Moto extends Vehiculo{
    public Integer cilindrada;
    public boolean baul;

    public Moto(String patente, String marca, String modelo, double consumo, double precio, Integer ruedas, Integer cilindrada, boolean baul) {
        super(patente, marca, modelo, consumo, precio, ruedas);
        this.cilindrada = cilindrada;
        this.baul = baul;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isBaul() {
        return baul;
    }

    public void setBaul(boolean baul) {
        this.baul = baul;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return baul == moto.baul && cilindrada.equals(moto.cilindrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cilindrada, baul);
    }

    @Override
    public String toString() {
        return "\nMoto" +
                "\nCilindrada= " + cilindrada +
                "\nBaul= " + baul;

    }
}
