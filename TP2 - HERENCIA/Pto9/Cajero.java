package Pto9;

public class Cajero extends Empleado {
    
    public Cajero(String nombre, String dni, String domicilio, int fechaIngreso, String categoria) {
        super(nombre, dni, domicilio, fechaIngreso, categoria);
    }

    public double SueldoCajero() {
        return super.SueldoBasico();
    }

    public void imprimirRecibo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Sueldo Basico: $" + SueldoBasico());
        System.out.println("Total a cobrar: $" + SueldoBasico());
    }
}
