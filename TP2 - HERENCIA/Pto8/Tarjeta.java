package Pto8;

public class Tarjeta {
    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private int numeroTarjeta;
    private double saldoDisponible;
    private Persona datosTitular;
    //constructor
    public Tarjeta(EntidadFinanciera entidadFinanciera, String entidadBancaria, int numeroTarjeta,
            double saldoDisponible, Persona datosTitular) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
        this.datosTitular = datosTitular;
    }
    //get y set
    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public Persona getDatosTitular() {
        return datosTitular;
    }

    public void setDatosTitular(Persona datosTitular) {
        this.datosTitular = datosTitular;
    }

    //metodos
    public String SaldoDispoonible() {
        return "su saldo disponible es de: " + saldoDisponible;
    }

    public boolean validarSaldo(double monto, int cuotas) {
        double montoTotal = monto;
        if (cuotas > 1) {
            montoTotal = montoTotal * ((cuotas - 1) * 0.03); //Aplica recargo por cuotas adicionales
        }
        
        if (saldoDisponible >= montoTotal) {
            return true; //La tarjeta tiene saldo suficiente
        } else {
            return false; //Saldo insuficiente
        }
    }
    
}

