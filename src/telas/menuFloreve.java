/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author ander
 */
public class menuFloreve extends javax.swing.JFrame {

    /**
     * Creates new form menuFloreve
     */
    public menuFloreve() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btClientes = new javax.swing.JButton();
        btProdutos = new javax.swing.JButton();
        btFPlantas = new javax.swing.JButton();
        btPlantas = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btFornecedores = new javax.swing.JButton();
        btEncomendas = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btFProdutos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btClientes.setBackground(new java.awt.Color(102, 255, 102));
        btClientes.setText("Clientes");
        btClientes.setMaximumSize(new java.awt.Dimension(100, 50));
        btClientes.setPreferredSize(new java.awt.Dimension(120, 50));
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btProdutos.setBackground(new java.awt.Color(102, 255, 102));
        btProdutos.setText("Produtos");
        btProdutos.setMaximumSize(new java.awt.Dimension(100, 50));
        btProdutos.setPreferredSize(new java.awt.Dimension(120, 50));
        btProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutosActionPerformed(evt);
            }
        });

        btFPlantas.setBackground(new java.awt.Color(102, 255, 102));
        btFPlantas.setText("Fornecimento de plantas");
        btFPlantas.setMaximumSize(new java.awt.Dimension(100, 50));
        btFPlantas.setPreferredSize(new java.awt.Dimension(120, 50));
        btFPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFPlantasActionPerformed(evt);
            }
        });

        btPlantas.setBackground(new java.awt.Color(102, 255, 102));
        btPlantas.setText("Plantas");
        btPlantas.setMaximumSize(new java.awt.Dimension(100, 50));
        btPlantas.setPreferredSize(new java.awt.Dimension(120, 50));
        btPlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlantasActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(255, 51, 51));
        btSair.setText("SAIR");
        btSair.setMaximumSize(new java.awt.Dimension(100, 50));
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btFornecedores.setBackground(new java.awt.Color(102, 255, 102));
        btFornecedores.setText("Fornecedores");
        btFornecedores.setMaximumSize(new java.awt.Dimension(100, 50));
        btFornecedores.setPreferredSize(new java.awt.Dimension(120, 50));
        btFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFornecedoresActionPerformed(evt);
            }
        });

        btEncomendas.setBackground(new java.awt.Color(102, 255, 102));
        btEncomendas.setText("Encomendas");
        btEncomendas.setMaximumSize(new java.awt.Dimension(100, 50));
        btEncomendas.setPreferredSize(new java.awt.Dimension(120, 50));
        btEncomendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncomendasActionPerformed(evt);
            }
        });

        btConsultar.setBackground(new java.awt.Color(204, 255, 255));
        btConsultar.setText("Consultar");
        btConsultar.setMaximumSize(new java.awt.Dimension(100, 50));
        btConsultar.setPreferredSize(new java.awt.Dimension(120, 50));
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btFProdutos.setBackground(new java.awt.Color(102, 255, 102));
        btFProdutos.setText("Fornecimento de produtos");
        btFProdutos.setMaximumSize(new java.awt.Dimension(100, 50));
        btFProdutos.setPreferredSize(new java.awt.Dimension(120, 50));
        btFProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(btPlantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btEncomendas, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(btFPlantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEncomendas, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFPlantas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPlantas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
            login tlogin = new login();
            tlogin.setLocationRelativeTo(null);
            tlogin.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btFPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFPlantasActionPerformed
            telaFornPlanta tfp = new telaFornPlanta();
            tfp.setLocationRelativeTo(null);
            tfp.setVisible(true);
    }//GEN-LAST:event_btFPlantasActionPerformed

    private void btFProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFProdutosActionPerformed
       telaFornProduto tfp = new telaFornProduto();
       tfp.setLocationRelativeTo(null);
       tfp.setVisible(true);
    }//GEN-LAST:event_btFProdutosActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
       telaCliente tc = new telaCliente();
       tc.setLocationRelativeTo(null);
       tc.setVisible(true);
    }//GEN-LAST:event_btClientesActionPerformed

    private void btEncomendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncomendasActionPerformed
       telaEncomendas te = new telaEncomendas();
       te.setLocationRelativeTo(null);
       te.setVisible(true);
    }//GEN-LAST:event_btEncomendasActionPerformed

    private void btProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutosActionPerformed
       telaProduto tpr = new telaProduto();
       tpr.setLocationRelativeTo(null);
       tpr.setVisible(true);
    }//GEN-LAST:event_btProdutosActionPerformed

    private void btPlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlantasActionPerformed
       telaPlanta tpl = new telaPlanta();
       tpl.setLocationRelativeTo(null);
       tpl.setVisible(true);
    }//GEN-LAST:event_btPlantasActionPerformed

    private void btFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFornecedoresActionPerformed
       telaFornecedor tf = new telaFornecedor();
       tf.setLocationRelativeTo(null);
       tf.setVisible(true);
    }//GEN-LAST:event_btFornecedoresActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
       consultas tcon = new consultas();
       tcon.setLocationRelativeTo(null);
       tcon.setVisible(true);
    }//GEN-LAST:event_btConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(menuFloreve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuFloreve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuFloreve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuFloreve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuFloreve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEncomendas;
    private javax.swing.JButton btFPlantas;
    private javax.swing.JButton btFProdutos;
    private javax.swing.JButton btFornecedores;
    private javax.swing.JButton btPlantas;
    private javax.swing.JButton btProdutos;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
