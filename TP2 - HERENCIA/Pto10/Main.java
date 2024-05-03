package Pto10;

public class Main {
        public static void main(String[] args) {
            // Crear dos inmuebles: una casa y un local comercial
            CasaAbierta casa_rural = new CasaAbierta(12345, 150.0, "Calle 123, Barrio lol", 3, 2);
            LocalesComerciales local_comercial = new LocalesComerciales(54321, 80.0, "Avenida Piloti", Localizacion.INTERNO, "piroca");

            casa_rural.imprimir();
            local_comercial.imprimir();
        }
    }

