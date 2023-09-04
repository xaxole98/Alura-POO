package com.abdcbank;

public class TestReferencia4 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(555);
        // Desde la instancia cuenta de Diego estamos inicializando Cliente.
        cuentaDeDiego.setTitular(new Cliente());
        cuentaDeDiego.getTitular().setNombre("Diego");
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
}
