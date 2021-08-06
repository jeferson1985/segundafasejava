/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculamedia;

import java.util.Scanner;

/**
 *
 * @author jeferson.jesus
 */
public class Media {
    
}

/*Exercicio da aula do Luciano calcular media de 2 notas*/

public class Aula {

    public static void main(String[] args) {
        int qtdeMediasSomadas;

        Scanner sc = new Scanner(System.in);
        int turma = sc.nextInt();

        for (int i = 0; i < turma; i++) {
            System.out.println("Digite o nome do aluno:");
            String aluno = sc.next();

            System.out.println("Digite a primeira nota");
            double nota1 = sc.nextDouble();

            System.out.println("Digite a segunda nota");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno" + aluno + "foi" + media);

            if (media >= 7) {
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Aluno Reprovado");
            }

            System.out.println("");
            qtdeMediasSomadas++;
        }
        System.out.println("Você calculou a media de:" + qtdeMediasSomadas);
        System.out.println("Fim");

        sc.close();

    }

}
