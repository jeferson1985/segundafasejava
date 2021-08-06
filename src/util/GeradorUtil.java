/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;


/**
 *
 * @author jeferson.jesus
 */
public class GeradorUtil {

    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int) (Math.random() * 10);
            senha = senha + numero;
        }
        return senha;

    }

    public String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "." + "-" + gerarNumero(2);
    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 10000);
        return numero;
    }

    public String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3) + "/0001" + "-" + gerarNumero(2);

    }

    public String gerarTelefone() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public String gerarCelular() {
        return "(48)9" + gerarNumero(4) + "-" + gerarNumero(4);
    }

    public String gerarCep() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

    public String gerarNome() {
        String[] nomes = {"João", "Maria", "Pedro", "Paulo", "José", "Ana", "Carlos", "Patrícia", "Ivan", "Juliana", "Cleide", "Marizete", "Paula",
            "Marcos", "Diodio", "Diego", "Alex", "Jéssica", "Melissa", "Carmem", "Hugo", "Mariele"};

        int indice = (int) (Math.random() * nomes.length);

        return nomes[indice] + " " + gerarSobrenome();

    }

    private String gerarSobrenome() {
        String[] sobreNomes = {"Silva", "Motta", "Oliveira", "Abravaneu", "Mendes", "Pereira", "Pires", "Ribeiro", "Santos", "Panizzi", "Souza", "Mattos", "Pinto",
            "Almeida", "Alves", "Fontes", "Carvalho", "Inácio", "Colombo", "Saraiva", "Mendes", "Brasil"};
        int indice = (int) (Math.random() * sobreNomes.length);
        return sobreNomes[indice];

    }

}

public class static void main(String[] args){
        GeradorUtil util = new GeradorUtil();

        System.out.println("Cpf " + util.gerarCpf());

        System.out.println("Salário " + util.gerarSalario());

        System.out.println("Cpnj " + util.gerarCnpj());

        System.out.println("Telefone " + util.gerarTelefone());

        System.out.println("Celular " + util.gerarCelular());

        System.out.println("Cep " + util.gerarCep());

        System.out.println("Nome: " + util.gerarNome());

       




}

}

