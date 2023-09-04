package com.abdcbank;

public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuentaDeAlex = new Cuenta(555);
        cuentaDeAlex.depositar(500);
        cuentaDeAlex.setNumero(9875664);
        System.out.println(cuentaDeAlex.getSaldo());
    }
}