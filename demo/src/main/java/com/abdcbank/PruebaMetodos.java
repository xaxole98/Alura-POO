package com.abdcbank;

public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta cuentaDeEjemplo = new Cuenta(555);
        Cuenta cuentaDeEjemplo2 = new Cuenta(555);
        cuentaDeEjemplo2.depositar(1000);
        cuentaDeEjemplo2.transferir(300, cuentaDeEjemplo);
    }
}
