package com.bancodio.dio;

import com.bancodio.dio.entity.models.Cliente;
import com.bancodio.dio.entity.models.Conta;
import com.bancodio.dio.entity.models.ContaCorrente;
import com.bancodio.dio.entity.models.ContaPoupanca;

public class modelMain {
    public static void main(String[] args) {
        Cliente Ana = new Cliente();
        Ana.setNome("Ana Clara");

        Conta corrente = new ContaCorrente(Ana);
        Conta poupanca = new ContaPoupanca(Ana);

        corrente.depositar(1000d);
        poupanca.depositar(500d);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        corrente.transferir(200d,poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}