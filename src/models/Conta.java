package models;

import interfaces.IConta;
import lombok.Data;

@Data public abstract class Conta implements IConta {
    private static final int AGENCIA_ATUAL = 1000;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_ATUAL;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void ImprimirInfoComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.getAgencia());
        System.out.printf("Número : %d%n", this.getNumero());
        System.out.printf("Saldo  : %.2f%n", this.getSaldo());
    }

}
