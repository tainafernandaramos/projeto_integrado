package classes;

import uteis.Conexao;

public class ClassControleEntrada {
    private Integer codControleE;
    private Integer codf;
    private Integer codp;
    private Integer qntMov;
    private Conexao con;
    
    public ClassControleEntrada(){
        this.con = new Conexao();
    }
    
     public ClassControleEntrada(Integer codControleE, Integer codf, Integer codp) {
        this.codControleE = codControleE;
        this.codf = codf;
        this.codp = codp;
        this.qntMov = qntMov;
        
        this.con = new Conexao();
    }
    
     public boolean inserir(String codf, String codp, String qntMov){
        String strSQL = "INSERT INTO controleentrada (codf, codp, qntMov)" +
                "VALUES('" + codf + "', '" + codp + "' , '" + qntMov + "' )";
        
        System.out.println(strSQL);        
        return this.con.executar(strSQL);
    }
     
     public static String consultaEntrada(String codf){
        String strSQL = "SELECT controleentrada.codControleE, fornecedor.razaof, produto.descp, controleentrada.qntMov" +
                         " FROM controleentrada" +
                         " INNER JOIN fornecedor ON fornecedor.codf = controleentrada.codf" +
                         " INNER JOIN produto ON produto.codp = controleentrada.codp" ;
         
         
        return strSQL;
    }
     
}
