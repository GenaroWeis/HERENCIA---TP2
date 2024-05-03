package Pto10;

public class CasaCerrada extends Casas {
    private Double ValorAdministracion;
    private boolean IncluyeCaposDeportivos;
    private boolean IncluyePiscina;
    
    public CasaCerrada(int id, double area, String direccion, int numHabitaciones, int numBaños,
    Double valorAdministracion, boolean incluyeCaposDeportivos, boolean incluyePiscina) {
        super(id, area, direccion, numHabitaciones, numBaños);
        ValorAdministracion = valorAdministracion;
        IncluyeCaposDeportivos = incluyeCaposDeportivos;
        IncluyePiscina = incluyePiscina;
    }

    public Double getValorAdministracion() {
        return ValorAdministracion;
    }

    public void setValorAdministracion(Double valorAdministracion) {
        ValorAdministracion = valorAdministracion;
    }

    public boolean isIncluyeCaposDeportivos() {
        return IncluyeCaposDeportivos;
    }

    public void setIncluyeCaposDeportivos(boolean incluyeCaposDeportivos) {
        IncluyeCaposDeportivos = incluyeCaposDeportivos;
    }

    public boolean isIncluyePiscina() {
        return IncluyePiscina;
    }

    public void setIncluyePiscina(boolean incluyePiscina) {
        IncluyePiscina = incluyePiscina;
    }
    
    public Double getValor(){
        double valor = getArea() * 2500000;
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
        System.out.println("Incluye Capos Deportivos: " + isIncluyeCaposDeportivos());
        System.out.println("Incluye Piscina: " + isIncluyePiscina());
    }
    

}
