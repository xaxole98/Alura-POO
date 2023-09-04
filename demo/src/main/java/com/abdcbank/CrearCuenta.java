package com.abdcbank;

public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(555);
        primeraCuenta.depositar(500);
        System.out.println(primeraCuenta.getSaldo());
        Cuenta segundaCuenta = new Cuenta(555);
        segundaCuenta.depositar(600);
        System.out.println(segundaCuenta.getSaldo());
        System.out
                .println("De esta forma te daras cuenta que NO son el mismo objeto al hacer referencia: "
                        + primeraCuenta);
        System.out
                .println("De esta forma te daras cuenta que NO son el mismo objeto al hacer referencia: "
                        + segundaCuenta);

        // Comprobrar si son la misma ubicacion de memoria
        if (primeraCuenta == segundaCuenta) {
            System.out.println("Son lo mismo");
        } else {
            System.out.println("No son lo mismo");
        }
    }

}
