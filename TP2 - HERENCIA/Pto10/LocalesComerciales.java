package Pto10;

public class LocalesComerciales extends Inmueble{
    private Localizacion localizacion;
    private String centroComercial;

    public LocalesComerciales(int id, double area, String direccion, Localizacion localizacion, String centroComercial) {
        super(id, area, direccion);
        this.localizacion = localizacion;
        this.centroComercial = centroComercial;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

    public Double getValor(){
        double valor = getArea() * 3000000;
        return valor;
    }

    public void imprimir(){
        System.out.println("ID: " + getId());
        System.out.println("Area: " + getArea());
        System.out.println("Direccion: " + getDireccion());
        System.out.println("Valor: " + getValor());
        System.out.println("Localizacion: " + getLocalizacion());
        System.out.println("Centro Comercial: " + getCentroComercial());
    }
}
