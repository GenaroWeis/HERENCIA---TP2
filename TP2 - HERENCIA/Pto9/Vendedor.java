package Pto9;

public class Vendedor extends Empleado {
    private double ventasMensuales;

    public Vendedor(String nombre, String dni, String domicilio, int fechaIngreso, String categoria, double ventasMensuales) {
        super(nombre, dni, domicilio, fechaIngreso, categoria);
        this.ventasMensuales = ventasMensuales;
    }

   public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public double SueldoVendedor() {
        return super.SueldoBasico() + (ventasMensuales * 0.005); // 0.5% de comisión
    }

    public void imprimirRecibo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Domicilio: " + getDomicilio());
        System.out.println("Fecha de Ingreso: " + getFechaIngreso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Sueldo Basico: $" + SueldoBasico());
        System.out.println("Total de ventas mensuales: " + ventasMensuales);
        System.out.println("Total a cobrar: $" + SueldoVendedor());
    }
}
