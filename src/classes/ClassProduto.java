package classes;

import java.sql.ResultSet;
import javax.persistence.Basic;
import javax.persistence.Column;
import uteis.Conexao;

public class ClassProduto {
 
    public Integer getCodp() {
        return codp;
    }

    public void setCodp(Integer codp) {
        this.codp = codp;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getQntmin() {
        return qntmin;
    }

    public void setQntmin(Integer qntmin) {
        this.qntmin = qntmin;
    }

    public Integer getQntmax() {
        return qntmax;
    }

    public void setQntmax(Integer qntmax) {
        this.qntmax = qntmax;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
    }
    
    
    
    private Integer codp;
    private Integer saldo;
    private Integer qntmin;
    private Integer qntmax;
    private String descp;
    private String marca;
    private String modelo;
    private Conexao con;
    
    public ClassProduto(){
        this.con = new Conexao();
    }

    
    public ClassProduto(Integer codc, Integer saldo, Integer qntmin, Integer qntmax, String descp) {
        this.codp = codp;
        this.saldo = saldo;
        this.qntmin = qntmin;
        this.qntmax = qntmax;
        this.descp = descp;       
        
        this.con = new Conexao();
    }
    
     public ClassProduto(Integer codp, Integer saldo, Integer qntmin, Integer qntmax, String descp, String marca, String modelo) {
        this.codp = codp;
        this.saldo = saldo;
        this.qntmin = qntmin;
        this.qntmax = qntmax;
        this.descp = descp;
        this.marca = marca;
        this.modelo = modelo;
        this.con = new Conexao();
    }
     
     
     public boolean inserir(){
        
          String strSQL = "INSERT INTO Produto(qntmin, saldo, qntmax, descp, marca, modelo)" +
                "VALUES (" + this.qntmin + "," + this.saldo + ", " + this.qntmax + " , " +
                "'" + this.descp + "', '" + this.marca + "', '" + this.modelo + "')";
                       
                 
                
        System.out.println(strSQL);
        
        return this.con.executar(strSQL);
        //System.out.println(strSQL);
    
    }
     
     public boolean excluir(String codp){
        
     String strSQL = "DELETE FROM produto WHERE codp ='" + codp + "'";
     
     return this.con.executar(strSQL);
    }  
     
     public boolean entradaP (int codp, int saldo){
         String strSQL = "UPDATE produto set saldo =  '" + saldo + "' WHERE codp = '" + codp + "'";
         System.out.println(strSQL);
         return this.con.executar(strSQL);
    
     }
     
     public boolean reativar(String codp){
     String strSQL = "call mortoproduto(" + codp + ")";
     return this.con.executar(strSQL);
    }
     
     public static String consultaProduto(String where){
        String strSQL = "SELECT * FROM produto WHERE " + where + "1=1";
        
         return strSQL;
    }
    
     public static String consultaProdutoMorto(String where){
        String strSQL = "SELECT * FROM produtom WHERE " + where + "1=1";
        
         return strSQL;
    }
     
     public boolean editar (){
        String strSQL;
        
        strSQL = "UPDATE produto SET qntmin = " + this.qntmin + ", qntmax = " + this.qntmax + " " +
                " , descp = '" + this.descp + "'  , marca = '" + this.marca + "' , modelo = '" + this.modelo + "' " +
                " WHERE codp ='" + codp + "' ";
        
        return this.con.executar(strSQL);
    }
     
}