package formularios;

import classes.ClassCliente;
import classes.ClassControleEntrada;
import static classes.ClassFornecedor.consultaFornecedor;
import classes.ClassProduto;
import static classes.ClassProduto.consultaProduto;
import classes.ProjetoIntegrado;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import uteis.Conexao;

public class FrmControleEntrada extends javax.swing.JFrame {

public FrmControleEntrada() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);//desativa a opção rest. tamanho
        setDefaultCloseOperation(FrmControleEstoque.DO_NOTHING_ON_CLOSE); //desabilita o botão fechar
        atualizaGRIDF(true);
        atualizaGRIDP(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bancoprojetointegrado?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        fornecedorQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Fornecedor f");
        fornecedorList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : fornecedorQuery.getResultList();
        produtoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery.getResultList();
        produtoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery1.getResultList();
        fornecedorQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Fornecedor f");
        fornecedorList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : fornecedorQuery1.getResultList();
        produtoQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery2.getResultList();
        produtoQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery3.getResultList();
        produtoQuery4 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery4.getResultList();
        produtoQuery5 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery5.getResultList();
        produtoQuery6 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery6.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoPesquisaP = new javax.swing.JTextField();
        txtDescricaoPesquisaP = new javax.swing.JTextField();
        btnPesquisarP = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoPesquisaF = new javax.swing.JTextField();
        txtDescricaoPesquisaF = new javax.swing.JTextField();
        btnPesquisarF = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidadeE = new javax.swing.JTextField();
        btnSalvarE = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Entrada no Estoque");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoPesquisaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoPesquisaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));

        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Codigo Fornecedor");

        jLabel4.setText("Razão Social");

        btnPesquisarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarF.setText("Pesquisar");
        btnPesquisarF.setIconTextGap(20);
        btnPesquisarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoPesquisaF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricaoPesquisaF)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigoPesquisaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoPesquisaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPesquisarF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidadeE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
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
        btnSair.setPreferredSize(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButton1.setText("Consultar Entradas");
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
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
    
    private void atualizaGRIDF(boolean pesquisar){
        String where = "";
        
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        if(pesquisar){
            if(!txtCodigoPesquisaF.getText().equals(""))
                where += "codf = " + txtCodigoPesquisaF.getText() + " AND ";
            if(!txtDescricaoPesquisaF.getText().equals(""))
                where += "razaof like '%" + txtDescricaoPesquisaF.getText() + "%' AND ";
        }
        
        Conexao con = new Conexao();
        
        con.consultar(consultaFornecedor (where));
        
        ResultSet rs = con.resultSet;
        
        if(rs == null)
            return;
        
        DefaultTableModel dtm = new DefaultTableModel() {  
            public boolean isCellEditable(int row, int column) {  
                return false;  
            }  
        };
        
        dtm.addColumn("codf");  
        dtm.addColumn("cnpjcpff");  
        dtm.addColumn("razaof"); 
        dtm.addColumn("nomefantansiaf"); 
        dtm.addColumn("enderecof"); 
        dtm.addColumn("numerof"); 
        dtm.addColumn("cepf");
        dtm.addColumn("cidadef"); 
        dtm.addColumn("estadof"); 
        dtm.addColumn("contatof"); 
        dtm.addColumn("telefonef1"); 
        dtm.addColumn("telefonef2"); 
        
        try {
            while (rs.next()) {
                dtm.addRow(new String[] {rs.getString("codf"), rs.getString("cnpjcpff"), rs.getString("razaof"),
                rs.getString("nomefantansiaf"), rs.getString("enderecof"), rs.getString("numerof"),
                rs.getString("cepf"), rs.getString("cidadef"), rs.getString("estadof"),
                rs.getString("contatof"), rs.getString("telefonef1"), rs.getString("telefonef2")});  
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        jTable1.setModel(dtm);
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
        
        ClassControleEntrada ce = new ClassControleEntrada();
        
        String codigoProduto = jTable2.getValueAt(jTable2.getSelectedRow(), 0).toString(); //seta a linha selecionada e a coluna 0
        int codP = Integer.parseInt(codigoProduto);
        
        String codigoFornecedor = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(); //seta a linha selecionada e a coluna 0
        
        String qntMov = (txtQuantidadeE.getText());
        
        String saldoP = jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString(); //seta a linha selecionada e a coluna 0
        int saldoProduto = Integer.parseInt(saldoP);
        
        String quantMax = jTable2.getValueAt(jTable2.getSelectedRow(), 4).toString(); //seta a linha selecionada e a coluna 0
        int max = Integer.parseInt(quantMax);
        
        int saldo = saldoProduto + Integer.parseInt(txtQuantidadeE.getText());
        
        if(ce.inserir(codigoFornecedor, codigoProduto, qntMov) == true){
                JOptionPane.showMessageDialog(null, "Inserido fornecedor: " + codigoFornecedor  + "" + 
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

    private void btnPesquisarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFActionPerformed
        //PESQUISAR FORNECEDOR
        atualizaGRIDF(true);
    }//GEN-LAST:event_btnPesquisarFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmConsultaEntrada frmCE= new FrmConsultaEntrada();
       frmCE.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmControleEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmControleEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmControleEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmControleEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmControleEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisarF;
    private javax.swing.JButton btnPesquisarP;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarE;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<classes.Fornecedor> fornecedorList;
    private java.util.List<classes.Fornecedor> fornecedorList1;
    private javax.persistence.Query fornecedorQuery;
    private javax.persistence.Query fornecedorQuery1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private java.util.List<classes.Produto> produtoList;
    private java.util.List<classes.Produto> produtoList1;
    private java.util.List<classes.Produto> produtoList2;
    private java.util.List<classes.Produto> produtoList3;
    private java.util.List<classes.Produto> produtoList4;
    private java.util.List<classes.Produto> produtoList5;
    private java.util.List<classes.Produto> produtoList6;
    private javax.persistence.Query produtoQuery;
    private javax.persistence.Query produtoQuery1;
    private javax.persistence.Query produtoQuery2;
    private javax.persistence.Query produtoQuery3;
    private javax.persistence.Query produtoQuery4;
    private javax.persistence.Query produtoQuery5;
    private javax.persistence.Query produtoQuery6;
    private javax.swing.JTextField txtCodigoPesquisaF;
    private javax.swing.JTextField txtCodigoPesquisaP;
    private javax.swing.JTextField txtDescricaoPesquisaF;
    private javax.swing.JTextField txtDescricaoPesquisaP;
    private javax.swing.JTextField txtQuantidadeE;
    // End of variables declaration//GEN-END:variables
}
