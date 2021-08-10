/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author jeferson.jesus
 */
public class Aluno {

    private String nome;
    private String idade;
    private String telefone;
    private float salario;
    private String logradouro;
    private String numero;
    private String bairro;
    private long cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
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

    public void setLogradouro(Float logardouro) {
        this.logradouro = logradouro;

    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;

    }

    public String getNumero() {
        return numero;
    }

    public void setBairro(String numero) {
        this.numero = numero;

    }

    public String getBairro() {
        return bairro;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;

    }

    public Long getCpf() {
        return cpf;
    }
    public static void main(String[] args) {
        
    }
}
