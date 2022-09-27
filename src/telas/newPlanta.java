package telas;

import floreve.plantaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class newPlanta extends javax.swing.JFrame {
    plantaDAO plant;
    
    /**
     * Creates new form newPlanta
     */
    public newPlanta() {
        initComponents();
        initcustom();
    }

        private void initcustom(){
          plant = new plantaDAO();
          setTitle("adicionar plantas");
          setResizable(false);
        
        if(!plant.banco.GetConnection()){
          JOptionPane.showMessageDialog(null, "Falha na conexão");
          System.exit(0);    
        }        
    }
    
        void limpaCampos() {
            tf_NomeCie.setText("");
            tf_NomePop.setText("");
            tf_Preco.setText("");
            tf_Tamanho.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_adicionar = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        tf_Preco = new javax.swing.JTextField();
        tf_Tamanho = new javax.swing.JTextField();
        tf_NomeCie = new javax.swing.JTextField();
        tf_NomePop = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_adicionar.setText("Adicionar");
        bt_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_adicionarActionPerformed(evt);
            }
        });

        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        tf_Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_PrecoActionPerformed(evt);
            }
        });

        tf_Tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_TamanhoActionPerformed(evt);
            }
        });

        tf_NomeCie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeCieActionPerformed(evt);
            }
        });

        tf_NomePop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomePopActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome popular:");

        jLabel3.setText("Nome científico:");

        jLabel5.setText("Tamanho:");

        jLabel6.setText("Preço:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Tamanho, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_Preco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_adicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_cancelar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_NomeCie, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(tf_NomePop))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_NomePop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_NomeCie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_adicionarActionPerformed
        if(tf_NomeCie.getText().equals("")){
            JOptionPane.showMessageDialog(null, "campo de nome cientifico vazio!");
            tf_NomeCie.requestFocus();
            return;
        }

        if(tf_NomePop.getText().equals("")){
            JOptionPane.showMessageDialog(null, "campo nome popular vazio!");
            tf_NomePop.requestFocus();
            return;
        }

        if(tf_Preco.getText().equals("")){
            JOptionPane.showMessageDialog(null, "campo preço vazio!");
            tf_Preco.requestFocus();
            return;
        }
        if(tf_Tamanho.getText().equals("")){
            JOptionPane.showMessageDialog(null, "campo tamanho vazio!");
            tf_Tamanho.requestFocus();
            return;
        }
        
        plant.p1.setNomeCie(tf_NomeCie.getText());
        plant.p1.setNomePop(tf_NomePop.getText());
        plant.p1.setPreco(Double.parseDouble(tf_Preco.getText()));
        plant.p1.setTamanho(Double.parseDouble(tf_Tamanho.getText()));
        JOptionPane.showMessageDialog(null, plant.atualizar(plantaDAO.INCLUSAO));
        limpaCampos();
    }//GEN-LAST:event_bt_adicionarActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void tf_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_PrecoActionPerformed

    private void tf_TamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_TamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_TamanhoActionPerformed

    private void tf_NomeCieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeCieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomeCieActionPerformed

    private void tf_NomePopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomePopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomePopActionPerformed

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
            java.util.logging.Logger.getLogger(newPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPlanta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newPlanta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adicionar;
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tf_NomeCie;
    private javax.swing.JTextField tf_NomePop;
    private javax.swing.JTextField tf_Preco;
    private javax.swing.JTextField tf_Tamanho;
    // End of variables declaration//GEN-END:variables
}
