package Pto10;

public class Casas extends Inmueble {
    private int numHabitaciones;
    private int numBaños;

    public Casas(int id, double area, String direccion, int numHabitaciones, int numBaños) {
        super(id, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
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

    public void imprimir(){
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Numero de Habitaciones: " + getNumHabitaciones());
        System.out.println("Numero de Baños: " + getNumBaños());
    }

}
