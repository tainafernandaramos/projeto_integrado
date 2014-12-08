package classes;

import formularios.FrmPrincipal;
import uteis.Conexao;

public class ProjetoIntegrado {

    public static boolean fechar(){  
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Fechar?","AVISO ",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
            //this.dispose();  
           FrmPrincipal frmP = new FrmPrincipal();
            frmP.setVisible(true);
            //dispose();
            return true;
        }
        
        else {
            return false;
        }
       
    }
   
    public static boolean isNumeric (String n){//abre isNumeric
        try {//abre try
            int i = Integer.parseInt(n);
            return true;
        }//fecha try
        
        catch (Exception e) {//abre
            return false;
        }//fecha cactch
    }//fecha isNumeric
       
    public static void main(String[] args) {
        
    }
    
}
