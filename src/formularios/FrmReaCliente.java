package formularios;

import classes.ClassCliente;
import static classes.ClassCliente.consultaCliente;
import static classes.ClassCliente.consultaClienteMorto;
import classes.ProjetoIntegrado;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import uteis.Conexao;

public class FrmReaCliente extends javax.swing.JFrame {

    public FrmReaCliente() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);//altera cor do form
        setResizable(false);//desativa a opção rest. tamanho
        setDefaultCloseOperation(FrmCadCliente.DO_NOTHING_ON_CLOSE); //desabilita o botão fechar
        atualizaGRIDC(true);
    }
    
    private void atualizaGRIDC(boolean pesquisar){
        String where = "";
        
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        if(pesquisar){
            
            if(!txtCodigoPesquisa.getText().equals(""))
                where += "codc = " + txtCodigoPesquisa.getText() + " AND ";
            if(!txtDescricaoPesquisa.getText().equals(""))
                where += "razaoc like '%" + txtDescricaoPesquisa.getText() + "%' AND ";
        }
        
        Conexao con = new Conexao();
         
        con.consultar(consultaClienteMorto (where));
       
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
        
        jTable1.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bancoprojetointegrado?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        btnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtCodigoPesquisa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDescricaoPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnReativar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reativar Cliente");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setIconTextGap(20);
        btnSair.setPreferredSize(new java.awt.Dimension(160, 40));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Cliente"));
        jPanel2.setPreferredSize(new java.awt.Dimension(730, 415));

        jScrollPane1.setViewportView(jTable1);

        jLabel13.setText("Codigo");

        jLabel14.setText("Razão Social");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setIconTextGap(20);
        btnPesquisar.setPreferredSize(new java.awt.Dimension(140, 40));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescricaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtDescricaoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnReativar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ativar.png"))); // NOI18N
        btnReativar.setText("Ativar Cliente");
        btnReativar.setIconTextGap(5);
        btnReativar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnReativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReativarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReativar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       
       boolean fechar = ProjetoIntegrado.fechar();
       if (fechar == true){
       FrmCadCliente cl = new FrmCadCliente();
       cl.setVisible(true);        
       dispose(); 
       }
       
       else {
       return;
       }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnReativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReativarActionPerformed

        int linhaSelecionada = jTable1.getSelectedRow();
        
        if (linhaSelecionada >= 0 ){
            if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja realmente reativar cadastro?","CONFIRMAÇÃO",javax.swing.JOptionPane.YES_NO_OPTION )==0){
        ClassCliente cl = new ClassCliente();
        String codigoCliente = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(); //seta a linha selecionada e a coluna 0
        cl.reativar(codigoCliente);
        JOptionPane.showMessageDialog(this, "Cliente Ativo");
        }
        atualizaGRIDC(true);   
        }
        
        else {
            JOptionPane.showMessageDialog(this, "Selecione um cadastro");
        }
    }//GEN-LAST:event_btnReativarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        atualizaGRIDC(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnReativar;
    private javax.swing.JButton btnSair;
    private java.util.List<classes.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigoPesquisa;
    private javax.swing.JTextField txtDescricaoPesquisa;
    // End of variables declaration//GEN-END:variables
}
