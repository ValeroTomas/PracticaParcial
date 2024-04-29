import java.lang.*;
import Concesionario.*;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("ABC123", "Toyota", "2003", 1.3, 15, 4, "Manual", "Esta Lindo");
        Moto moto1 = new Moto("DEF456", "Huawei", "2013", 0.5, 7, 2, 110, true);
        Concesionario nuevo = new Concesionario();

        nuevo.agregarVehiculo(auto1);
        nuevo.agregarVehiculo(moto1);

        nuevo.borrarPorPatente("DEF456");

        nuevo.devolverListado();

        System.out.println("\nVehiculos: " + nuevo.contarVehiculo());




    }
}