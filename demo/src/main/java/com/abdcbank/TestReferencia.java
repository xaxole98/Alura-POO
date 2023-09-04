package com.abdcbank;

public class TestReferencia {
        public static void main(String[] args) {
                Cuenta primeraCuenta = new Cuenta(555);
                Cuenta segundaCuenta = primeraCuenta;
                primeraCuenta.depositar(200);
                segundaCuenta.depositar(500);
                System.out.println("Saldo de primera cuenta asignado es 200: " + primeraCuenta.getSaldo());
                System.out.println(
                                "Saldo de segunda cuenta asignado es 500, pero al volver a ser asignado, afecta a la asignacion primera: "
                                                + segundaCuenta.getSaldo());
                segundaCuenta.depositar(500);
                System.out.println(
                                "Saldo de primera cuenta es afectado por el incremento de 500 realizado en segunda cuenta: "
                                                + primeraCuenta.getSaldo());
                System.out
                                .println("De esta forma te daras cuenta que son el mismo objeto al hacer referencia: "
                                                + primeraCuenta);
                System.out
                                .println("De esta forma te daras cuenta que son el mismo objeto al hacer referencia: "
                                                + segundaCuenta);
        }

}
