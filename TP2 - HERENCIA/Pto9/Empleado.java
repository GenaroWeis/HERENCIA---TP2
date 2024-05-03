package Pto9;

public class Empleado {
    private String nombre;
    private String dni;
    private String domicilio;
    private int fechaIngreso;
    private String categoria; 

    public Empleado(String nombre, String dni, String domicilio, int fechaIngreso, String categoria) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaIngreso = fechaIngreso;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public double SueldoBasico() {
        return 650000; 
    }

    public void imprimirRecibo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Categoria: " + categoria);
        System.out.println("Sueldo Basico: $" + SueldoBasico());
        System.out.println("Total a cobrar: $" + SueldoBasico());
    }
}