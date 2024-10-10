package com.example.atividadeambiente4;

public class Mdc {
    // Método que calcula o MDC e retorna o resultado como String
    public String calcularMdc(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return "O MDC é: " + num1;
    }
}