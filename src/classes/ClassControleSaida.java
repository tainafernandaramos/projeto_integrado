package classes;

import uteis.Conexao;

public class ClassControleSaida {
    private Integer codControleS;
    private Integer codc;
    private Integer codp;
    private Integer qntMov;
    private Conexao con;
    
    public ClassControleSaida(){
        this.con = new Conexao();
    }
        
     public ClassControleSaida(Integer codControleS, Integer codc, Integer codp) {
        this.codControleS = codControleS;
        this.codc = codc;
        this.codp = codp;
        this.qntMov = qntMov;
        
        this.con = new Conexao();
    }
    
     public boolean inserir(String codc, String codp, String qntMov){
        String strSQL = "INSERT INTO controlesaida (codc, codp, qntMov)" +
                "VALUES('" + codc + "', '" + codp + "' , '" + qntMov + "')";
        
        System.out.println(strSQL);        
        return this.con.executar(strSQL);
    }
     
     public static String consultaSaida(String codc){
        String strSQL = "SELECT controlesaida.codControleS, cliente.razaoc, produto.descp, controlesaida.qntMov" +
                         " FROM controlesaida " +
                         " INNER JOIN cliente ON cliente.codc = controlesaida.codc" +
                         " INNER JOIN produto ON produto.codp = controlesaida.codp" ;
         
         
        return strSQL;
    }
    
}
