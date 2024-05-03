package Pto10;

public class Inmueble {
    private int id;
    private double area; //Metros cuadrados
    private String direccion;

    public Inmueble(int id, double area, String direccion) {
        if (verificarId(id)) {
            this.id = id;
        } else {
            System.out.println("El ID debe tener 5 dígitos");
        }
        this.area = area;
        this.direccion = direccion;
    }


    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public double getArea() {
        return area;
    }



    public void setArea(double area) {
        this.area = area;
    }



    public String getDireccion() {
        return direccion;
    }



    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    
    //metodos
    private boolean verificarId(int id) {
        return String.valueOf(id).length() >= 5;
    }

    public void imprimirInmueble() {
        System.out.println("Id: " + id);
        System.out.println("Area: " + area);
        System.out.println("Direccion: " + direccion);
    }
}
