/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadora;

/**
 *
 * @author dell
 */
public class Operadora {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operadores aritm√©ticos
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma); // Soma: 15
        System.out.println("SubtraÁ„o: " + subtracao); // Subtra√ß√£o: 5
        System.out.println("MultiplicaÁ„o: " + multiplicacao); // Multiplica√ß√£o: 50
        System.out.println("Divis„o: " + divisao); // Divis√£o: 2
        System.out.println("Resto: " + resto); // Resto: 0

        // Operadores de compara√ß√£o
        boolean igual = a == b;
        boolean diferente = a != b;
        boolean maior = a > b;
        boolean menor = a < b;
        boolean maiorOuIgual = a >= b;
        boolean menorOuIgual = a <= b;

        System.out.println("Igual: " + igual); // Igual: false
        System.out.println("Diferente: " + diferente); // Diferente: true
        System.out.println("Maior: " + maior); // Maior: true
        System.out.println("Menor: " + menor); // Menor: false
        System.out.println("Maior ou igual: " + maiorOuIgual); // Maior ou igual: true
        System.out.println("Menor ou igual: " + menorOuIgual); // Menor ou igual: false

        // Operadores l√≥gicos
        boolean and = (a > b) && (a < 20);
        boolean or = (a < b) || (a < 20);
        boolean not = !(a > b);

        System.out.println("AND: " + and); // AND: true
        System.out.println("OR: " + or); // OR: true
        System.out.println("NOT: " + not); // NOT: false

        // Operadores de atribui√ß√£o
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

        System.out.println("AtribuiÁ„o: " + c); // Atribui√ß√£o: 10

        // Operadores de incremento e decremento
        int d = a++;
        int e = ++b;
        int f = a--;
        int g = --b;

        System.out.println("Incremento: " + d); // Incremento: 10
        System.out.println("Incremento: " + e); // Incremento: 6
        System.out.println("Decremento: " + f); // Decremento: 11
        System.out.println("Decremento: " + g); // Decremento: 5
    }
}
