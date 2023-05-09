/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

/**
 *
 * @author alunos
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Operadores op = new Operadores();

// Operadores de atribuição
float x = 10;
System.out.println("x antes da atribuição: " + x);
op.atribuicao(x, 5);
System.out.println("x depois da atribuição: " + x);

// Operadores lógicos
boolean a = true;
boolean b = false;
System.out.println("a AND b: " + op.and(a, b));
System.out.println("a OR b: " + op.or(a, b));

// Operadores de comparação
float y = 10;
System.out.println("y == x: " + op.igualdade(y, x));
System.out.println("y != x: " + op.diferenca(y, x));
System.out.println("y > x: " + op.maiorQue(y, x));
System.out.println("y < x: " + op.menorQue(y, x));
System.out.println("y >= x: " + op.maiorOuIgualQue(y, x));

}
    
}
