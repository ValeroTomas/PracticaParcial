package Concesionario;

import Concesionario.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Vehiculo> lista;

    public Concesionario() {
        this.lista = new ArrayList<Vehiculo>();
    }

    public ArrayList<Vehiculo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Vehiculo> lista) {
        this.lista = lista;
    }

    public void agregarVehiculo(Vehiculo v) {
        lista.add(v);
    }

    public Vehiculo buscarPorPatente(String patente) {
        int i;
        Vehiculo vehiculo;
        for (i = 0; i < lista.size(); i++) {
            vehiculo = lista.get(i);
            if (vehiculo.getPatente().equals(patente)) {
                return vehiculo;
            }
        }
        return null;
    }

    public int contarVehiculo() {
        return lista.size();
    }

    public boolean borrarPorPatente(String p) {
        int i;
        int flag = -1;
        Vehiculo vehiculo;
        for (i = 0; i < lista.size() && flag == -1; i++) {
            vehiculo = lista.get(i);
            if (vehiculo.getPatente().equals(p)) {
                flag = i;
                lista.remove(i);
                return true;
            }
        }
        return false;
    }


    public void devolverListado() {

        int i;
        Vehiculo vehiculo;
        for (i = 0; i < lista.size(); i++) {
            vehiculo = lista.get(i);
            System.out.println(vehiculo.toString());
        }
    }
}

