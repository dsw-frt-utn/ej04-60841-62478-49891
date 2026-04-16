package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.IngresarVehiculo;
import views.ListarVehiculosView;
import views.Principal;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        Principal frame = new Principal();
        frame.ejecutar();
    }
}
