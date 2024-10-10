package com.example.atividadeambiente4;

public class CaractereParaNumero {
    public String string; // A string que contém os caracteres

    // Construtor
    public CaractereParaNumero(String string) {
        this.string = string;
    }

    // Método para converter a string em um número decimal
    public int converterParaDecimal() {
        int n = string.length();
        int decimal = 0;
        int base = Character.codePointAt(string, 0);
        int digito;

        // Realiza a conversão dos caracteres para decimal
        for (int i = 0; i < n; i++) {
            digito = Character.codePointAt(string, i) - base;
            decimal = decimal * 10 + digito;
        }

        return decimal; // Retorna o valor decimal
    }
}

