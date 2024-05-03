package Pto8;

public class Main {
    
    public static void main(String[] args) {
        Persona titular = new Persona("Juaquin", "Henkel", 46613030, "juanperez@example.com", 292020);
        Tarjeta tarjeta = new Tarjeta(EntidadFinanciera.VISA, "Banco Pampa", 3234234, 1000000.0, titular);
        Posnet posnet = new Posnet();

        double monto = 9000000.0;
        int cuotas = 5;

        String resultadoPago = posnet.efectuarPago(tarjeta, monto, cuotas);
        if (resultadoPago != null) {
            System.out.println("Pago exitoso:\n" + resultadoPago);
        } else {
            System.out.println("Saldo insuficiente.");
        }
}
}