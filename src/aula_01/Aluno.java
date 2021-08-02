/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_01;

/**
 *
 * @author jeferson.jesus
 */
public class Aluno {

    private String nome;
    private String sobrenome;
    private String idade;
    private String telefone;
    private float salario;
    private String logradouro;
    private String numero;
    private String bairro;
    private boolean trabalha;
    private long cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;

    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setIdade(String idade) {
        this.idade = idade;

    }

    public String getIdade() {
        return idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }

    public String getTelefone() {
        return telefone;
    }

    public void setSalario(Float salario) {
        this.salario = salario;

    }

    public Float getSalario() {
        return salario;
    }
}
