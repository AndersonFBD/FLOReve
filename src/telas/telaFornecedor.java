package telas;

import floreve.fornecedorDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class telaFornecedor extends javax.swing.JFrame {
    private fornecedorDAO fornecedor;
    /** Creates new form telaFornecedor */
    public telaFornecedor() {
        initComponents();
        initcustom();
    }
    
      private void initcustom(){
        fornecedor = new fornecedorDAO();
        setTitle("Forncecedores");
        setResizable(false);
        
        if(!fornecedor.banco.GetConnection()){
            JOptionPane.showMessageDialog(null, "falha na conexão");
            System.exit(0);
        }
    }
      
    public void habilitar(boolean tfid, boolean tfnome, boolean tftel,
            boolean tfend,boolean beditar, boolean bremover, boolean bsalvar){
            tf_idFornecedor.setEnabled(tfid);
            tf_endereco.setEnabled(tfend);
            tf_nome.setEnabled(tfnome);
            tf_telefone.setEnabled(tftel);
            bt_editar.setEnabled(beditar);
            bt_remover.setEnabled(bremover);
            bt_salvar.setEnabled(bsalvar);
                
    }
    
        void limpaCampos(){
        tf_idFornecedor.setText("");
        tf_nome.setText("");
        tf_endereco.setText("");
        tf_telefone.setText("");
     }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
        
        public void atualizarCampos(){
        fornecedor.f1.setId(Integer.parseInt(tf_idFornecedor.getText()));
        if (fornecedor.localizar()){
            tf_idFornecedor.setText(String.valueOf(fornecedor.f1.getId()));
            tf_nome.setText(fornecedor.f1.getNome());
            tf_endereco.setText(fornecedor.f1.getEndereco());
            tf_telefone.setText(fornecedor.f1.getTelefone());
        }
        else{
            JOptionPane.showMessageDialog(null, "fornecedor não encontrado");
            limpaCampos();
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_salvar = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tf_endereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        tf_telefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_idFornecedor = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_salvar.setText("Salvar");
        bt_salvar.setEnabled(false);
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        bt_voltar.setText("Voltar");
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        jLabel8.setText("nome:");

        tf_endereco.setEnabled(false);
        tf_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_enderecoActionPerformed(evt);
            }
        });

        jLabel9.setText("telefone:");

        tf_nome.setEnabled(false);
        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        tf_telefone.setEnabled(false);
        tf_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telefoneActionPerformed(evt);
            }
        });

        jLabel2.setText("endereço:");

        jLabel1.setText("id do forncecedor:");

        bt_pesquisar.setText("Pesquisar");
        bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pesquisarActionPerformed(evt);
            }
        });

        bt_novo.setText("novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_editar.setText("editar");
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_remover.setText("deletar");
        bt_remover.setEnabled(false);
        bt_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_idFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_pesquisar)
                    .addComponent(jLabel1)
                    .addComponent(tf_idFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_novo)
                    .addComponent(jLabel8)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_editar)
                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(bt_remover)
                    .addComponent(tf_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed

        fornecedor.f1.setId(Integer.parseInt(tf_idFornecedor.getText()));
        fornecedor.f1.setEndereco(tf_endereco.getText());
        fornecedor.f1.setNome(tf_nome.getText());
        fornecedor.f1.setTelefone(tf_telefone.getText());
        JOptionPane.showMessageDialog(null, "dados atualizados." +fornecedor.atualizar(fornecedorDAO.ALTERACAO));
        limpaCampos();
        habilitar(true, false, false, false, true, false, false);
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void tf_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_enderecoActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telefoneActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
        atualizarCampos();
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        newFornecedor nf = new newFornecedor(); 
        nf.setLocationRelativeTo(null);
        nf.setVisible(true);
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        if(tf_idFornecedor.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "preencha o campo id");
        } else {
            habilitar(true,true,true,true,true,true,true);
        }
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removerActionPerformed
        fornecedor.f1.setId(Integer.parseInt(tf_idFornecedor.getText()));
        fornecedor.localizar();
        int n = JOptionPane.showConfirmDialog(null,"deseja apagar o fornecedor de registro " +fornecedor.f1.getId()+" dos registros?", "remover fornecedor?", JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "removido! " +fornecedor.atualizar(fornecedorDAO.EXCLUSAO));
            limpaCampos();
            habilitar(true, false, false, false ,true, false, false);
        }
    }//GEN-LAST:event_bt_removerActionPerformed

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
            java.util.logging.Logger.getLogger(telaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JButton bt_remover;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf_endereco;
    private javax.swing.JTextField tf_idFornecedor;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_telefone;
    // End of variables declaration//GEN-END:variables

}
