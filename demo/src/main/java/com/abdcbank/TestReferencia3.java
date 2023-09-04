package com.abdcbank;

public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(555);
        Cliente diego = new Cliente();
        cuentaDeDiego.setTitular(diego);
        System.out.println(cuentaDeDiego.getTitular().getNombre());
        diego.setNombre("Alex");
        System.out.println(diego.getNombre());
        cuentaDeDiego.getTitular().setNombre("Diego");
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }

}
