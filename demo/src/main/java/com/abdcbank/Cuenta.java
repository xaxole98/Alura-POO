package com.abdcbank;

public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total;

    public Cuenta(int agencia) {
        if (agencia <= 0) {
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
            System.out.println("Se ha creado existosamente una nueva cuenta");
        }
        total++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Your deposit was successful, your money deposit is " + valor);
    }

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Your withdraw is sucess, your money withdraw is " + valor);
            return true;
        } else {
            System.out.println("The desired amount to withdraw is greater than the amount of existing balance");
            return false;
        }

    }

    public boolean transferir(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            cuenta.depositar(valor);
            System.out.println("Haz logrado una transferencia exitosa hacia " + cuenta + "de una cantidad de " + valor);
            return true;
        } else {
            System.out.println("La transferencia no es posible");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int nuevoNumero) {
        this.numero = nuevoNumero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

}
