package Pto10;

public class Oficinas extends Inmueble {
    
    public Oficinas(int id, double area, String direccion) {
        super(id, area, direccion);
    }

    public Double getValor(){
        double valor = getArea() * 2400000;
        return valor;
    }
    public void imprimir(){
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Valor: " + getValor());
    }
}
