package com.example.atividadeambiente4;

public class SomaDeNumeros {
    private int n;
    private int soma;
    int i;

    // Construtor
    public SomaDeNumeros(int n) {
        this.n = n;
        this.soma = 0;
        this.i = 0;
    }

    // Método para adicionar um número à soma
    public void adicionarNumero(int num) {
        this.soma += num;
        this.i++;
    }

    // Método para verificar se todos os números foram somados
    public boolean finalizado() {
        return this.i >= this.n;
    }

    // Método para obter o resultado da soma
    public int getResultado() {
        return this.soma;
    }
}

