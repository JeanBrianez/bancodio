package com.bancodio.dio.entity.models;

import lombok.Data;

import java.util.List;

@Data public class Banco {
    private String nome;
    private List<Conta> contas;
}