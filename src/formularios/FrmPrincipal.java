package formularios;

import classes.ProjetoIntegrado;
import java.awt.Color;

/**
 *
 * @author Luis, Samia e Taina
 */
public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        setResizable(false);//desativa a opção rest. tamanho
        getContentPane().setBackground(Color.WHITE);//altera a cor de fundo
        setDefaultCloseOperation(FrmPrincipal.DO_NOTHING_ON_CLOSE); //desabilita o botão fechar
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        btnCadProduto = new javax.swing.JButton();
        btnCadFornecedor = new javax.swing.JButton();
        btnCadCliente = new javax.swing.JButton();
        btnControleEstoque = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setAutoRequestFocus(false);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));

        btnCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCadProduto.png"))); // NOI18N
        btnCadProduto.setText("Cadastrar Produto");
        btnCadProduto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnCadProduto.setIconTextGap(70);
        btnCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProdutoActionPerformed(evt);
            }
        });

        btnCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCadFornecedor.png"))); // NOI18N
        btnCadFornecedor.setText("Cadastrar Fornecedor");
        btnCadFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnCadFornecedor.setIconTextGap(50);
        btnCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFornecedorActionPerformed(evt);
            }
        });

        btnCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeCadCliente.png"))); // NOI18N
        btnCadCliente.setText("Cadastrar Cliente");
        btnCadCliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnCadCliente.setIconTextGap(70);
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });

        btnControleEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeControleEstoque.png"))); // NOI18N
        btnControleEstoque.setText("Controle de Estoque");
        btnControleEstoque.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnControleEstoque.setIconTextGap(60);
        btnControleEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControleEstoqueActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/planoDeFundo.01.jpg"))); // NOI18N

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnControleEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(btnCadProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnControleEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnControleEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControleEstoqueActionPerformed
       FrmControleEstoque frmCE = new FrmControleEstoque();
       frmCE.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnControleEstoqueActionPerformed

    private void btnCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProdutoActionPerformed
       FrmCadProd frmCP = new FrmCadProd();
       frmCP.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnCadProdutoActionPerformed

    private void btnCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFornecedorActionPerformed
       FrmCadForn frmCF = new FrmCadForn();
       frmCF.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnCadFornecedorActionPerformed

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
       FrmCadCliente frmCC = new FrmCadCliente();
       frmCC.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja realmente encerrar aplicação?","CONFIRMAÇÃO",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
           System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JButton btnCadFornecedor;
    private javax.swing.JButton btnCadProduto;
    private javax.swing.JButton btnControleEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
