package com.bancodio.dio.entity.interfaces;

import com.bancodio.dio.entity.models.Conta;

public interface IConta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
