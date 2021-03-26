package exer5;

import java.util.Scanner;


public class Exer5 {

    
    public static void main(String[] args) {
        Scanner leia;
        leia = new Scanner (System.in);
        
        float salario;
        float minimo;
        float resultado;
        
        System.out.println("Digite o salário de um funcionário:");
        salario = Float.parseFloat(leia.nextLine());
        
        System.out.println("Digite o salário minimo: ");
        minimo =  Float.parseFloat(leia.nextLine());
        
       resultado = salario + minimo;
        System.out.println(resultado);
        
    }
    
}
