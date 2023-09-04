package com.abdcbank;

public class TestReferencia2 {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setTelefono("99565656");
        diego.setTelefono("786412368");

        Cuenta cuentaDeDiego = new Cuenta(555);
        cuentaDeDiego.setTitular(diego);
        System.out.println(cuentaDeDiego.getTitular().getNombre());
        System.out.println(cuentaDeDiego.getTitular());
        System.out.println(diego);
        System.out.println();
    }

}
