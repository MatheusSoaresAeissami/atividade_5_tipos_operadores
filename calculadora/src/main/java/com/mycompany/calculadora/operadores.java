/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Emerson Souza
 */
public class operadores {


    public float adicao(float v1, float v2){
        return v1+v2;
    }
    public float subtracao(float v1, float v2){
        return v1-v2;
     }
    public float multiplicacao(float v1, float v2){
        return v1*v2;
     }
    public float divisao(float v1, float v2){
        return v1/v2;
    }



    public float atribuicao_soma (float v1, float v2){
        return v1+=v2;
    }
    public float atribuicao_subtracao (float v1, float v2){
        return v1-=v2;
    }

    public float atribuicao_multiplicacao (float v1, float v2){
        return v1=v2;
    }
    public float atribuicao_divisao (float v1, float v2){
        return v1/=v2;
    }
    public float atribuicao_porcentagem (float v1, float v2){
        return v1%=v2;
    }



    public boolean comparacao_igual_a (float v1, float v2){
        return v1 == v2;
    }
    public boolean comparacao_diferente_de (float v1, float v2){
        return v1 != v2;
    }
    public boolean comparacao_menor_que (float v1, float v2){
        return v1<v2;
    }
    public boolean comparacao_maior_que (float v1, float v2){
        return v1>v2;
    }

   public boolean logico_e(float v1,float v2,float v3,float v4){
    if (v1 > v2 & v3 == v4){
        return true;
    }
    else return false;
   }
   public boolean logico_ou(float v1,float v2,float v3,float v4){
    if (v1 > v2 || v3 == v4){
        return true;
    }
    else return false;
   }
   
   public boolean logico_ou_boolean(float v1,float v2,float v3,float v4){
    if (v1 > v2 | v3 == v4){
        return true;
    }
    else return false;
   }
   
     public boolean logico_or(float v1,float v2,float v3,float v4){
    if (v1 == v2 ^ v3>=v4){
        return true;
    }
    
    else return false;
   }
    public boolean logico_not(float v1,float v2){
        return !(v1 < v2);
        }
 
    public boolean comparacao_menor_igual (float v1, float v2){
        return v1<=v2;
    }
    
    public boolean comparacao_maior_igual (float v1, float v2){
        return v1>=v2;
    }
    
   public boolean logico_ee(float v1,float v2,float v3,float v4){
    if (v1 > v2 && v3==v4){
        return true;
    }

    else return false;
}
}
