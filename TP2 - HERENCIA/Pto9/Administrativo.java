package Pto9;

// esta hecho en base al sueldo mensual, por ende los valores a tener en cuenta son mensuales
//no se nos brindo info como cuanto vale la hora de laburo, por ende lo trabaje de esta manera 
public class Administrativo extends Empleado {
    private int horasTrabajadas;
    private double valorHoradeLaburo = 650000/240; //(suponiendo que son 240 horas mensuales)

    public Administrativo(String nombre, String dni, String domicilio, int fechaIngreso, String categoria) {
        super(nombre, dni, domicilio, fechaIngreso, categoria);
    }

    public String determinarJornada(){
        if (horasTrabajadas > 120){ //240 horas en promedio mensuales suponiendo que son jornadas de 8hras
            return "Media"; //media jornada
        }
        else{
            return "Completa"; //completa jornada
        }
    }

    public double SueldoAdministrador() {
        double sueldo = (horasTrabajadas * valorHoradeLaburo);
        return sueldo;
    }

    public void imprimirRecibo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Sueldo Basico: $" + SueldoBasico());
        System.out.println("Jornada: " + determinarJornada());
        System.out.println("Total a cobrar: $" + SueldoAdministrador());
    }
}
   
 