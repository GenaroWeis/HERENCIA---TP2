package Pto9;

public class Repartidor extends Empleado {
        private int repartosMensuales;
    
        public Repartidor(String nombre, String dni, String domicilio, int fechaIngreso, String categoria, int repartosMensuales) {
            super(nombre, dni, domicilio, fechaIngreso, categoria);
            this.repartosMensuales = repartosMensuales;
        }
    
        public double SueldoRepartidor() {
            return super.SueldoBasico() + (repartosMensuales * 500); // $500 por cada reparto
    }

    public void imprimirRecibo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Sueldo Basico: $" + SueldoBasico());
        System.out.println("Cantidad de repartos:" + repartosMensuales);
        System.out.println("Total a cobrar: $" + SueldoRepartidor());
    }
}

