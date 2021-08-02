/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import aula_01.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author jeferson.jesus
 */
public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        aluno.setNome(nome);
        
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno:");
        aluno.setSobrenome(sobrenome);
        
        String idade = JOptionPane.showInputDialog("Digite o idade  do aluno:");
        aluno.setIdade(idade);
        
        String telefone = JOptionPane.showInputDialog("Digite o telefone  do aluno:");
        aluno.setTelefone(telefone);
        
        String salario = JOptionPane.showInputDialog("Digite o salario do aluno:");
        aluno.setSalario(Float.parseFloat(salario));

        
        System.out.println("Nome" + aluno.getNome());
        System.out.println("Sobrenome" + aluno.getSobrenome());
        System.out.println("Idade" + aluno.getIdade());
        System.out.println("Telefone" + aluno.getTelefone());
        System.out.println("Salario" + aluno.getSalario());




        
    }
}
//        aluno.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno:"); 
//        aluno.idade = JOptionPane.showInputDialog("Digite o idade do aluno:");
//        
//        //String salario = JOptionPane.showInputDialog("Digite seu salário:");
//       // aluno.salario = Float.parseFloat(salario);
//        
//        aluno.salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario"));
//        
//        aluno.cpf = Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf"));
//        
//        JOptionPane.showMessageDialog(null, "Nome:" + aluno.nome + "  " + aluno.sobrenome 
//        + " "  + "\nIdade:" +aluno.idade  + "\nSalario: " + aluno.salario + "\nCpf: " + aluno.cpf);
////    }
//}
