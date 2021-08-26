/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import entidade.Professor;
import javax.swing.JOptionPane;

/**
 *
 * @author joao.costa3
 */
public class CadastroProfessor extends javax.swing.JFrame {

    private Professor professor;
    /**
     * Creates new form CadastroAluno
     */
    public CadastroProfessor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
                                            

    private boolean validarFormulario(){
        String nome = varNome.getText().trim();
        if (validarQtd3Digitos(nome)){
            JOptionPane.showMessageDialog(null, "digite um nome correto!");
            return true;
        }
        
        if (validarEmail()){
            JOptionPane.showMessageDialog(null, "digite um email correto!");
            return true;
        }
        
        if (validarTelefone()){
            JOptionPane.showMessageDialog(null, "digite um telefone correto!");
            return true;
        }
        
        if (validarCracha()){
            JOptionPane.showMessageDialog(null, "digite um cracha correto!");
            return true;
        }
        
        String logradouro = varLogradouro.getText().trim();
        if (validarQtd3Digitos(logradouro)){
            JOptionPane.showMessageDialog(null, "digite um logradouro correto!");
            return true;
        }
        
        String bairro = varBairro.getText().trim();
        if (validarQtd3Digitos(bairro)){
            JOptionPane.showMessageDialog(null, "digite um bairro correto!");
            return true;
        }
        
        String cidade = varCidade.getText().trim();
        if (validarQtd3Digitos(cidade)){
            JOptionPane.showMessageDialog(null, "digite uma cidade correta!");
            return true;
        }
        
    return false;
    }
    
    private boolean validarCracha(){
        String cracha = varCracha.getText().trim();
        return cracha.length() != 5;
    }
    
    private boolean validarEmail(){
        String email = varEmail.getText().trim();
        return !email.contains("@") || !email.contains("."); 
    }
    
    private boolean validarTelefone(){
        String telefone = varTelefone.getText().trim();
        return telefone.length() != 14;
    }
    
    private boolean validarQtd3Digitos(String valor){
        return valor.length() < 3;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        lblogradouro = new javax.swing.JLabel();
        varLogradouro = new javax.swing.JTextField();
        lbbairro = new javax.swing.JLabel();
        varBairro = new javax.swing.JTextField();
        lbcidade = new javax.swing.JLabel();
        varCidade = new javax.swing.JTextField();
        lbnome = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        lbemail = new javax.swing.JLabel();
        varEmail = new javax.swing.JTextField();
        lbtelefone = new javax.swing.JLabel();
        varTelefone = new javax.swing.JFormattedTextField();
        lbcracha = new javax.swing.JLabel();
        varCracha = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Cliente");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Cadastro Professor");

        lblogradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblogradouro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblogradouro.setText("Logradouro:");

        varLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varLogradouroActionPerformed(evt);
            }
        });

        lbbairro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbbairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbbairro.setText("Bairro:");

        varBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varBairroActionPerformed(evt);
            }
        });

        lbcidade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbcidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbcidade.setText("Cidade:");

        lbnome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbnome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbnome.setText("Nome:");

        lbemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbemail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbemail.setText("Email:");

        lbtelefone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbtelefone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbtelefone.setText("Telefone:");

        try {
            varTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        varTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTelefoneActionPerformed(evt);
            }
        });

        lbcracha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbcracha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbcracha.setText("Cracha:");

        try {
            varCracha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(lbnome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(lbcracha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varCracha))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(lbbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(lbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(lbtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(lblogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(lbcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(varCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnome)
                    .addComponent(varNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbemail)
                    .addComponent(varEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbtelefone)
                    .addComponent(varTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcracha)
                    .addComponent(varCracha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblogradouro)
                    .addComponent(varLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbbairro)
                    .addComponent(varBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcidade)
                    .addComponent(varCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void varLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varLogradouroActionPerformed

    private void varBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varBairroActionPerformed

    private void varTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTelefoneActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        professor = new Professor();
        boolean erro = validarFormulario();
        if (!erro) {
            //TODO chamar metodo que salva no bd
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel lbbairro;
    private javax.swing.JLabel lbcidade;
    private javax.swing.JLabel lbcracha;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lblogradouro;
    private javax.swing.JLabel lbnome;
    private javax.swing.JLabel lbtelefone;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField varBairro;
    private javax.swing.JTextField varCidade;
    private javax.swing.JFormattedTextField varCracha;
    private javax.swing.JTextField varEmail;
    private javax.swing.JTextField varLogradouro;
    private javax.swing.JTextField varNome;
    private javax.swing.JFormattedTextField varTelefone;
    // End of variables declaration//GEN-END:variables
}
