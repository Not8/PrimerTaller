package retornoDeDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Part1 {

    public static String tomarNombreUsuario(){
        return JOptionPane.showInputDialog(null, "Introduce tu nombre");
    }
    
    public static LocalDate tomarFechaNacimiento(){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            return LocalDate.parse(JOptionPane.showInputDialog(null,
             "Introduce tu fecha de nacimiento en el formato 'DD/MM/YYYY'"),
            formatter);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Formato de la fecha incorrecto");
        }
        return null;
    }
}
