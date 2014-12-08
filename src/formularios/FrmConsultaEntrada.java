package formularios;

import static classes.ClassCliente.consultaCliente;
import static classes.ClassControleEntrada.consultaEntrada;
import classes.ProjetoIntegrado;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import uteis.Conexao;

public class FrmConsultaEntrada extends javax.swing.JFrame {

    public FrmConsultaEntrada() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);//altera cor do form
        setResizable(false);//desativa a opção rest. tamanho
        setDefaultCloseOperation(FrmCadCliente.DO_NOTHING_ON_CLOSE); //desabilita o botão fechar
        atualizaGRID(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bancoprojetointegrado?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        controleentradaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Controleentrada c");
        controleentradaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : controleentradaQuery.getResultList();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Entrada");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setIconTextGap(20);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 663, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
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

    private void atualizaGRID(boolean pesquisar){
        String codf = "";
        
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
        Conexao con = new Conexao();
        
        con.consultar(consultaEntrada (codf));
        
        ResultSet rs = con.resultSet;
        
        if(rs == null)
            return;
        
        DefaultTableModel dtm = new DefaultTableModel() {  
            public boolean isCellEditable(int row, int column) {  
                return false;  
            }  
        };
        
        dtm.addColumn("codControleE");  
        dtm.addColumn("codp");  
        dtm.addColumn("codf"); 
        dtm.addColumn("qntMov"); 
         
        
        try {
            while (rs.next()) 
            
            {
                dtm.addRow(new String[] {rs.getString("codControleE"), rs.getString("descp"), rs.getString("razaof"),
                rs.getString("qntMov")
                
                } );  
            }
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        jTable1.setModel(dtm);
    }
    
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
            java.util.logging.Logger.getLogger(FrmConsultaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultaEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private java.util.List<formularios.Controleentrada> controleentradaList;
    private javax.persistence.Query controleentradaQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
