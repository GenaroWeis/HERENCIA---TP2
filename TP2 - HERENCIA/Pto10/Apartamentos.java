package Pto10;

public class Apartamentos extends Inmueble{
    private int numHabitaciones;
    private int numBaños;
    private double valorAdministracion;
    private int cantHabitaciones;

    public Apartamentos(int id, double area, String direccion, int numHabitaciones, int numBaños, double valorAdministracion, int cantHabitaciones) {
        super(id, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
        this.valorAdministracion = valorAdministracion;
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }


    public Double getValor(){
        double valor = getArea() * 1800000;
        return valor;
    }
    
    public void imprimir(){
    System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Valor: " + getValor());
        System.out.println("Numero de Habitaciones: " + getNumHabitaciones());
        System.out.println("Numero de Baños: " + getNumBaños());
        System.out.println("Valor Administracion: " + getValorAdministracion());
        System.out.println("Cantidad de Habitaciones: " + getCantHabitaciones());    
}
}