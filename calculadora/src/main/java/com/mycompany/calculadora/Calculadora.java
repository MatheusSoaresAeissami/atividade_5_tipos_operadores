/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Emerson Souza
 */
public class Calculadora {

    public static void main (String[]args){
        operadores op = new operadores();
        System.out.println("O resultado da soma é: "+op.adicao(10,5));
        System.out.println("O resultado da subtração é: "+op.subtracao(10,5));
        System.out.println("O resultado da multiplicação é: "+op.multiplicacao(10,5));
        System.out.println("O resultado da divisão é: "+op.divisao(10,5));
        System.out.println("O resultado de += é: "+op.atribuicao_soma(10,5));
        System.out.println("O resultado de -= é: "+op.atribuicao_subtracao(10,5));
        System.out.println("O resultado de *= é: "+op.atribuicao_multiplicacao(10,5));
        System.out.println("O resultado de /= é: "+op.atribuicao_divisao(10,5));
        System.out.println("O resultado de %= é: "+op.atribuicao_porcentagem(10,5));
        System.out.println("O resultado de == é:"+op.comparacao_igual_a(10,5));
        System.out.println("O resultado de != é: "+op.comparacao_diferente_de(10, 5));
        System.out.println("O valor 1 menor que valor 2? "+op.comparacao_menor_que(10,5));
        System.out.println("O valor 1 maior que valor 2? "+op.comparacao_maior_que(10,5));
        System.out.println("O valor 1 menor ou igual a valor 2? "+op.comparacao_menor_igual(10,5));
        System.out.println("O valor 1 maior ou igual a valor 2? "+op.comparacao_maior_igual(10,5));
        System.out.println("O valor 1 maior que valor 2 e o valor 3 é igual a valor 4? "+op.logico_ee(10, 5, 44, 44)); //&&
        System.out.println("O valor 1 maior que valor 2 e o valor 3 é igual a valor 4? "+op.logico_e(10, 5, 44, 27)); //&
        System.out.println("O valor 1 menor que valor 2 ou valor 3 é diferente de valor 4? "+op.logico_ou(10, 5, 44, 4)); // ||
        System.out.println("O valor 1 maior que o valor 2 e o valor 3 é igual a valor 4? "+op.logico_ou_boolean(10, 5, 44, 44)); // |
        System.out.println("O valor 1 igual a valor 2 e o valor 3 é maior ou igual a valor 4? "+op.logico_or(1, 5, 4, 4)); // ^
        System.out.println("O valor 1 igual a valor 2? "+op.logico_not(10, 10)); // !
        System.out.println("O valor 1 igual a valor 2? "+op.logico_not(10, 5)); // !

    }

}
