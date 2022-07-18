package Complementary_Exercises_lvl2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise6 {
    public static void main(String[] args) {
        Set<Empleado> empleadoSet = new HashSet<>();
        Map<Integer, Float> sueldo = new HashMap<>();
        empleadoSet.add(new Empleado("Lady Gaga", 45900333, 8, 120));
        empleadoSet.add(new Empleado("Harry Styles", 50697523, 10, 95));
        empleadoSet.add(new Empleado("Gene Simmons", 20144666, 9, 125));
        for (Empleado registro : empleadoSet) {
            System.out.println("Empleado: " + registro.nombre + " DNI: " + registro.dni);
        }
        for (Empleado tabla : empleadoSet) {
            sueldo.put(tabla.clave(), tabla.valor());
        }
        sueldo.forEach((dni, j) ->System.out.println("|-- Sueldo -- Empleado --" + "| DNI: "+dni+" - Sueldo U$: "+j));
    }
}
class Empleado { String nombre; Integer dni; Float horasTrabajadas; Float valorHora;
   
public Empleado(String nombre, Integer dni, int i, int j) {
    this.nombre = nombre;
    this.dni = dni;
    this.horasTrabajadas = (float) i; 
    this.valorHora = (float) j;
}
public int clave() {
    return this.dni;
}
public float valor() {
    return this.horasTrabajadas*this.valorHora;
}
}