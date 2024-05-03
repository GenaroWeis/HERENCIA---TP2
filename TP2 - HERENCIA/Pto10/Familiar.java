package Pto10;

public class Familiar extends Apartamentos {
 
    public Familiar(int id, double area, String direccion, int numHabitaciones, int numBaños, double valorAdministracion, int cantHabitaciones) {
        super(id, area, direccion, numHabitaciones, numBaños, valorAdministracion, cantHabitaciones);
        setCantHabitaciones (Math.max(1, cantHabitaciones));
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
