/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadora;

/**
 *
 * @author dell
 */
public class Calculadora1 {
public static void main(String[] args) {
            int a = 10;
            int b = 5;
    
            // Operadores aritméticos
            int soma = a + b;
            int subtracao = a - b;
            int multiplicacao = a * b;
            int divisao = a / b;
            int resto = a % b;
    
            // Operadores de comparação
            boolean igual = a == b;
            boolean diferente = a != b;
            boolean maior = a > b;
            boolean menor = a < b;
            boolean maiorOuIgual = a >= b;
            boolean menorOuIgual = a <= b;
    
            // Operadores lógicos
            boolean and = (a > b) && (a < 20);
            boolean or = (a < b) || (a < 20);
            boolean not = !(a > b);
    
            // Operadores de atribuição
            int c = a;
            c += b;
            c -= b;
            c *= b;
            c /= b;
            c %= b;
            c &= b;
            c |= b;
            c ^= b;
            c <<= b;
            c >>= b;
            c >>>= b;
    
            // Operadores de incremento e decremento
            int d = a++;
            int e = ++b;
            int f = a--;
            int g = --b;
        }
}