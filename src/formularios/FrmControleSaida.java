package formularios;

import static classes.ClassCliente.consultaCliente;
import classes.ClassControleEntrada;
import classes.ClassControleSaida;
import classes.ClassProduto;
import static classes.ClassProduto.consultaProduto;
import classes.ProjetoIntegrado;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import uteis.Conexao;

public class FrmControleSaida extends javax.swing.JFrame {

    public FrmControleSaida() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);//desativa a opção rest. tamanho
        setDefaultCloseOperation(FrmControleEstoque.DO_NOTHING_ON_CLOSE); //desabilita o botão fechar
        atualizaGRIDP(true);
        atualizaGRIDC(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bancoprojetointegrado?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        produtoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery.getResultList();
        produtoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery1.getResultList();
        produtoQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery2.getResultList();
        clienteQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoPesquisaP = new javax.swing.JTextField();
        txtDescricaoPesquisaP = new javax.swing.JTextField();
        btnPesquisarP = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoPesquisaC = new javax.swing.JTextField();
        txtDescricaoPesquisaC = new javax.swing.JTextField();
        btnPesquisarC = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidadeE = new javax.swing.JTextField();
        btnSalvarE = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Saída no Estoque");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, produtoList2, jTable2);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Codigo Produto");

        jLabel2.setText("Descrição");

        btnPesquisarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarP.setText("Pesquisar");
        btnPesquisarP.setIconTextGap(20);
        btnPesquisarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoPesquisaP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricaoPesquisaP)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarP)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoPesquisaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoPesquisaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel3.setText("Codigo Cliente");

        jLabel4.setText("Razão Social");

        btnPesquisarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarC.setText("Pesquisar");
        btnPesquisarC.setIconTextGap(20);
        btnPesquisarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCActionPerformed(evt);
            }
        });

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList1, jTable3);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoPesquisaC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricaoPesquisaC)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarC)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoPesquisaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoPesquisaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimentação"));

        jLabel5.setText("Quantidade");

        btnSalvarE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnSalvarE.setText("S\na\nl\nv\na\nr");
        btnSalvarE.setIconTextGap(20);
        btnSalvarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidadeE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(btnSalvarE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantidadeE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setIconTextGap(20);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButton1.setText("Consultar Saídas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair))))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atualizaGRIDP(boolean pesquisar){
        String where = "";
        
        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
         if(pesquisar){
            if(!txtCodigoPesquisaP.getText().equals(""))
                where += "codp = " + txtCodigoPesquisaP.getText() + " AND ";
            if(!txtDescricaoPesquisaP.getText().equals(""))
                where += "descp like '%" + txtDescricaoPesquisaP.getText() + "%' AND ";
        }
         
        Conexao con = new Conexao();
        
        con.consultar(consultaProduto (where));
        
        ResultSet rs = con.resultSet;
        
        if(rs == null)
            return;
        
        DefaultTableModel dtm = new DefaultTableModel() {  
            public boolean isCellEditable(int row, int column) {  
                return false;  
            }  
        };
        
        dtm.addColumn("codp");  
        dtm.addColumn("saldo");
        dtm.addColumn("descp");  
        dtm.addColumn("qntmin"); 
        dtm.addColumn("qntmax"); 
        dtm.addColumn("marca"); 
        dtm.addColumn("modelo"); 
        
        try {
            while (rs.next()) {
                dtm.addRow(new String[] {rs.getString("codp"), rs.getString("saldo"), rs.getString("descp"), rs.getString("qntmin"),
                rs.getString("qntmax"), rs.getString("marca"), rs.getString("modelo")});  
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        jTable2.setModel(dtm);
    }
    
    private void atualizaGRIDC(boolean pesquisar){
        String where = "";
        
        jTable3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        if(pesquisar){
            if(!txtCodigoPesquisaC.getText().equals(""))
                where += "codc = " + txtCodigoPesquisaC.getText() + " AND ";
            if(!txtDescricaoPesquisaC.getText().equals(""))
                where += "razaoc like '%" + txtDescricaoPesquisaC.getText() + "%' AND ";
        }
        
        Conexao con = new Conexao();
        
        con.consultar(consultaCliente (where));
        
        ResultSet rs = con.resultSet;
        
        if(rs == null)
            return;
        
        DefaultTableModel dtm = new DefaultTableModel() {  
            public boolean isCellEditable(int row, int column) {  
                return false;  
            }  
        };
        
        dtm.addColumn("codc");  
        dtm.addColumn("cnpjcpfc");  
        dtm.addColumn("razaoc"); 
        dtm.addColumn("nomefantansiac"); 
        dtm.addColumn("enderecoc"); 
        dtm.addColumn("numeroc"); 
        dtm.addColumn("cepc");
        dtm.addColumn("cidadec"); 
        dtm.addColumn("estadoc"); 
        dtm.addColumn("contatoc"); 
        dtm.addColumn("telefonec1"); 
        dtm.addColumn("telefonec2"); 
        
        try {
            while (rs.next()) {
                dtm.addRow(new String[] {rs.getString("codc"), rs.getString("cnpjcpfc"), rs.getString("razaoc"),
                rs.getString("nomefantansiac"), rs.getString("enderecoc"), rs.getString("numeroc"),
                rs.getString("cepc"), rs.getString("cidadec"), rs.getString("estadoc"),
                rs.getString("contatoc"), rs.getString("telefonec1"), rs.getString("telefonec2")});  
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        jTable3.setModel(dtm);
    }
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        boolean fechar = ProjetoIntegrado.fechar();
       
       if (fechar == true){
       FrmControleEstoque frmCE = new FrmControleEstoque();
       frmCE.setVisible(true);
        dispose();
       }
       
       else {
       return;
       }
    }//GEN-LAST:event_btnSairActionPerformed
  
        private boolean verificarDados(){
        
        //verificação do campo cnpjcpf
        String quantidade;
       
        if (ProjetoIntegrado.isNumeric(txtQuantidadeE.getText())){
            quantidade = (txtQuantidadeE.getText());
            if(quantidade.equals("")){
                JOptionPane.showMessageDialog(null, "Campo quantidade invalido");
                return false;
            }
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Campo quantidade invalido");
            txtQuantidadeE.requestFocus();
            return false;
        } 
        
        return true;
}
   
    private void btnSalvarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEActionPerformed
        if (!verificarDados()){
            return;
        }
        
        ClassControleSaida cs = new ClassControleSaida();
        
        String codigoProduto = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString(); //seta a linha selecionada e a coluna 0
        int codP = Integer.parseInt(codigoProduto);
        
        String codigoCliente = jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString(); //seta a linha selecionada e a coluna 0
        
        String qntMov = (txtQuantidadeE.getText());
        
        String saldoP = jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString(); //seta a linha selecionada e a coluna 0
        int saldoProduto = Integer.parseInt(saldoP);
        
        String quantMax = jTable2.getValueAt(jTable2.getSelectedRow(), 4).toString(); //seta a linha selecionada e a coluna 0
        int max = Integer.parseInt(quantMax);
        
        int saldo = saldoProduto - Integer.parseInt(txtQuantidadeE.getText());
        
        
       if(cs.inserir(codigoCliente, codigoProduto, qntMov) == true){
                JOptionPane.showMessageDialog(null, "Inserido cliente: " + codigoCliente  + "" + 
                " \n Produto: " + codigoProduto + "\n Saldo Anterior:" + saldoProduto + "" +
                "\n Quantidade Maxima: " + quantMax + "" + "\n Saldo Final: " + saldo + "");
                                
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro ao movimentar estoque, entre em contato com o Suporte.");
            }
        
        ClassProduto p = new ClassProduto();
        p.entradaP(codP, saldo);
        atualizaGRIDP(true);

    }//GEN-LAST:event_btnSalvarEActionPerformed
    
    private void btnPesquisarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPActionPerformed
        // PESQUISAR PRODUTO
        atualizaGRIDP(true);
    }//GEN-LAST:event_btnPesquisarPActionPerformed

    private void btnPesquisarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCActionPerformed
        //PESQUISAR CLIENTE
        atualizaGRIDC(true);
    }//GEN-LAST:event_btnPesquisarCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FrmConsultaSaida frmCS = new FrmConsultaSaida();
       frmCS.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmControleSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmControleSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmControleSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmControleSaida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmControleSaida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisarC;
    private javax.swing.JButton btnPesquisarP;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarE;
    private java.util.List<classes.Cliente> clienteList;
    private java.util.List<classes.Cliente> clienteList1;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.Query clienteQuery1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private java.util.List<classes.Produto> produtoList;
    private java.util.List<classes.Produto> produtoList1;
    private java.util.List<classes.Produto> produtoList2;
    private javax.persistence.Query produtoQuery;
    private javax.persistence.Query produtoQuery1;
    private javax.persistence.Query produtoQuery2;
    private javax.swing.JTextField txtCodigoPesquisaC;
    private javax.swing.JTextField txtCodigoPesquisaP;
    private javax.swing.JTextField txtDescricaoPesquisaC;
    private javax.swing.JTextField txtDescricaoPesquisaP;
    private javax.swing.JTextField txtQuantidadeE;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
