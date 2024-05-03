package Pto8;

public class Posnet {
    public String efectuarPago(Tarjeta tarjeta, double monto, int cuotas) {
        if (!tarjeta.validarSaldo(monto, cuotas)) {//si validar saldo da false
            return null; // Pago no exitoso por saldo insuficiente
        }

        double montoTotal = monto * (1 + (cuotas - 1) * 0.03);
        double montoCuota = montoTotal / cuotas;

        String ticket = "Nombre: " + tarjeta.getDatosTitular().getNombre() + " " + tarjeta.getDatosTitular().getApellido() +
                        "\nMonto total a pagar: $" + montoTotal +
                        "\nMonto de cada cuota: $" + montoCuota;

        return ticket;
    }
}
