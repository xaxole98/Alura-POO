package com.abdcbank;

public class TestReferencia5 {
    public static void main(String[] args) {
        // Ya no da exception NULL porque en CUENTA.JAVA estamos inicializando
        // Cliente.java, por ende tiene valor nulo y podemos reasignar ya que si
        // inicializamos cuenta.java se inicializa el Cliente tambien.
        Cuenta cuentaDeDiego = new Cuenta(555);
        System.out.println(cuentaDeDiego.getTitular().getNombre());
        cuentaDeDiego.getTitular().setNombre("Diego");
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
}
