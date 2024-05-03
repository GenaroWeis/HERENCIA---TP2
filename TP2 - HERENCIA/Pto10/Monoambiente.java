package Pto10;

public class Monoambiente extends Apartamentos{

    public Monoambiente(int id, double area, String direccion, int numHabitaciones, int numBaños, double valorAdministracion) {
        super(id, area, direccion, numHabitaciones, numBaños, valorAdministracion, 0);
    }

    public Double getValor(){
        double valor = getArea() * 1000000;
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
