package Pto9;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        // Crear instancias de cada tipo de empleado
        Administrativo admin = new Administrativo("Juan Pérez", "12345678", "Av. San Martín 123", 2020, "Administrativo");
        Cajero cajero = new Cajero("María Gómez", "98765432", "Calle Bolívar 456", 2019, "Cajero");
        Repartidor repartidor = new Repartidor("Pedro Rodríguez", "56789123", "Av. Libertador 789", 2021, "Repartidor", 15);
        Vendedor vendedor = new Vendedor("Lucía Martínez", "34567891", "Calle Mayor 456", 2018, "Vendedor", 1000000);

        // Llamar al método imprimirRecibo() de cada empleado
        System.out.println("-----Recibo de Administrativo-----");
        admin.imprimirRecibo();

        System.out.println("\n-----Recibo de Cajero-----");
        cajero.imprimirRecibo();

        System.out.println("\n-----Recibo de Repartidor-----");
        repartidor.imprimirRecibo();

        System.out.println("\n-----Recibo de Vendedor-----");
        vendedor.imprimirRecibo();
}
}