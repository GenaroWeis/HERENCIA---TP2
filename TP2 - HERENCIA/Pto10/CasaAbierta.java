package Pto10;

public class CasaAbierta extends Casas {
    
    public CasaAbierta(int id, double area, String direccion, int numHabitaciones, int numBaños) {
        super(id, area, direccion, numHabitaciones, numBaños);
    }

    public Double getValor(){
        double valor = getArea() * 1500000;
        return valor;
    }

    public void imprimir(){
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Valor: " + getValor());
        System.out.println("Numero de Habitaciones: " + getNumHabitaciones());
        System.out.println("Numero de Baños: " + getNumBaños());
    }
}
