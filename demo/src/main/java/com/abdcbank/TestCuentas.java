package com.abdcbank;

public class TestCuentas {

    public static void main(String[] args) {
        new Cuenta(111);
        new Cuenta(888);
        System.out.println(Cuenta.getTotal());

    }

}
