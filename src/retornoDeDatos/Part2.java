package retornoDeDatos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class Part2 {

    private String nombreUsuario;
    private LocalDate fechaNacimiento;
    private int edad;

    public Part2(){
        nombreUsuario = Part1.tomarNombreUsuario();
        fechaNacimiento = Part1.tomarFechaNacimiento();
    }

    private void calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        edad = (int)(ChronoUnit.YEARS.between(fechaNacimiento, fechaActual));
    }

    private String generarMensaje(){
        return "Nombre de usuario: "+nombreUsuario+"\nFecha de nacimiento: "+fechaNacimiento+
                "\nEdad: "+edad;
    }

    public void mostrarResultados(){
        calcularEdad();
        JOptionPane.showMessageDialog(null, generarMensaje());
    }
}
