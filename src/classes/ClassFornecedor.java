package classes;

import java.sql.ResultSet;
import javax.persistence.Basic;
import javax.persistence.Column;
import uteis.Conexao;

public class ClassFornecedor {
    
    public Integer getCodf() {
        return codf;
    }

    public void setCodf(Integer codf) {
        this.codf = codf;
    }

    public String getCnpjcpff() {
        return cnpjcpff;
    }

    public void setCnpjcpff(String cnpjcpff) {
        this.cnpjcpff = cnpjcpff;
    }

    public String getNomefantansiaf() {
        return nomefantansiaf;
    }

    public void setNomefantansiaf(String nomefantansiaf) {
        this.nomefantansiaf = nomefantansiaf;
    }

    public String getRazaof() {
        return razaof;
    }

    public void setRazaof(String razaof) {
        this.razaof = razaof;
    }

    public String getEnderecof() {
        return enderecof;
    }

    public void setEnderecof(String enderecof) {
        this.enderecof = enderecof;
    }

    public Integer getNumerof() {
        return numerof;
    }

    public void setNumerof(Integer numerof) {
        this.numerof = numerof;
    }

    public String getCepf() {
        return cepf;
    }

    public void setCepf(String cepf) {
        this.cepf = cepf;
    }

    public String getCidadef() {
        return cidadef;
    }

    public void setCidadef(String cidadef) {
        this.cidadef = cidadef;
    }

    public String getEstadof() {
        return estadof;
    }

    public void setEstadof(String estadof) {
        this.estadof = estadof;
    }

    public String getContatof() {
        return contatof;
    }

    public void setContatof(String contatof) {
        this.contatof = contatof;
    }

    public String getTelefonef1() {
        return telefonef1;
    }

    public void setTelefonef1(String telefonef1) {
        this.telefonef1 = telefonef1;
    }

    public String getTelefonef2() {
        return telefonef2;
    }

    public void setTelefonef2(String telefonef2) {
        this.telefonef2 = telefonef2;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
    }

    private Integer codf;
    private String cnpjcpff;
    private String nomefantansiaf;
    private String razaof;
    private String enderecof;
    private Integer numerof;
    private String cepf;
    private String cidadef;
    private String estadof;
    private String contatof;
    private String telefonef1;
    private String telefonef2;
    private Conexao con;
    
    public ClassFornecedor(){
        this.con = new Conexao();
    }
    
    
     public ClassFornecedor(Integer codf, String cnpjcpff, String razaof) {
        this.codf = codf;
        this.cnpjcpff = cnpjcpff;
        this.razaof = razaof;
        this.con = new Conexao();
    }
     
      public ClassFornecedor(Integer codf, String cnpjcpff, String nomeFantasiaf, String razaof, String enderecof, Integer numerof,String cepf, String cidadef, String estadof, String contatof, String telefonef1, String telefonef2) {
        this.codf = codf;
        this.cnpjcpff = cnpjcpff;
        this.nomefantansiaf = nomeFantasiaf;
        this.razaof = razaof;
        this.enderecof = enderecof;
        this.numerof = numerof;
        this.cepf = cepf;
        this.cidadef = cidadef;
        this.estadof = estadof;
        this.contatof = contatof;
        this.telefonef1 = telefonef1;
        this.telefonef2 = telefonef2;
        this.con = new Conexao();
    }
    
     public boolean inserir(){
        String strSQL = "INSERT INTO Fornecedor (cnpjcpff, razaof, nomefantansiaf, enderecof, numerof, cepf, cidadef, estadof, contatof, telefonef1, telefonef2)" +
                "VALUES('" + this.cnpjcpff + "', '" + this.razaof + "', '" + this.nomefantansiaf + "', " +
                "'" + this.enderecof + "', " + this.numerof + ", '" + this.cepf + "', " +
                "'" + this.cidadef + "', '" + this.estadof + "', '" + this.contatof + "', " +
                "'" + this.telefonef1 + "', '" + this.telefonef2 + "')";
        
        System.out.println(strSQL);
        
        return this.con.executar(strSQL);
    }
     
      public boolean excluir(String codf){
        
        String strSQL = "DELETE FROM fornecedor WHERE codf ='" + codf + "'";
        return this.con.executar(strSQL);
      }
      
      public boolean reativar(String codf){
        String strSQL = "call mortofornecedor(" + codf + ")";
        return this.con.executar(strSQL);
    }
      
      public static String consultaFornecedor(String where){
      String strSQL = "SELECT * FROM fornecedor WHERE " + where + "1=1";
      
      return strSQL;
      }
      
      public static String consultaFornecedorMorto(String where){
      String strSQL = "SELECT * FROM fornecedorm WHERE " + where + "1=1";
      
      return strSQL;
      }
      
      public boolean editar (){
        String strSQL;
        strSQL = "UPDATE fornecedor SET cnpjcpff = '" + this.cnpjcpff + "', razaof = '" + this.razaof + "' " +
                " , nomefantansiaf = '" + this.nomefantansiaf + "'  , enderecof = '" + this.enderecof + "' " +
                " , numerof= " + this.numerof + " , cepf = '" + this.cepf + "' , cidadef = '" + this.cidadef + "' " +
                " , estadof = '" + this.estadof + "' , contatof = '" + this.contatof + "' " +
                " , telefonef1= '" + this.telefonef1 + "' , telefonef2 = '" + this.telefonef2 + "' " +
                " WHERE codf ='" + codf + "'";
        
        return this.con.executar(strSQL);
    }
    
}
