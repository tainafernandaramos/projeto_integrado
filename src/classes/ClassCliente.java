package classes;

import java.sql.ResultSet;
import javax.persistence.Basic;
import javax.persistence.Column;
import uteis.Conexao;

public class ClassCliente {

    public Integer getCodc() {
        return codc;
    }

    public void setCodc(Integer codc) {
        this.codc = codc;
    }

    public String getCnpjcpfc() {
        return cnpjcpfc;
    }

    public void setCnpjcpfc(String cnpjcpfc) {
        this.cnpjcpfc = cnpjcpfc;
    }

    public String getNomefantansiac() {
        return nomefantansiac;
    }

    public void setNomefantansiac(String nomefantansiac) {
        this.nomefantansiac = nomefantansiac;
    }

    public String getRazaoc() {
        return razaoc;
    }

    public void setRazaoc(String razaoc) {
        this.razaoc = razaoc;
    }

    public String getEnderecoc() {
        return enderecoc;
    }

    public void setEnderecoc(String enderecoc) {
        this.enderecoc = enderecoc;
    }

    public Integer getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(Integer numeroc) {
        this.numeroc = numeroc;
    }

    public String getCepc() {
        return cepc;
    }

    public void setCepc(String cepc) {
        this.cepc = cepc;
    }

    public String getCidadec() {
        return cidadec;
    }

    public void setCidadec(String cidadec) {
        this.cidadec = cidadec;
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }

    public String getContatoc() {
        return contatoc;
    }

    public void setContatoc(String contatoc) {
        this.contatoc = contatoc;
    }

    public String getTelefonec1() {
        return telefonec1;
    }

    public void setTelefonec1(String telefonec1) {
        this.telefonec1 = telefonec1;
    }

    public String getTelefonec2() {
        return telefonec2;
    }

    public void setTelefonec2(String telefonec2) {
        this.telefonec2 = telefonec2;
    }
    
    
    
    private Integer codc;
    private String cnpjcpfc;
    private String nomefantansiac;
    private String razaoc;
    private String enderecoc;
    private Integer numeroc;
    private String cepc;
    private String cidadec;
    private String estadoc;
    private String contatoc;
    private String telefonec1;
    private String telefonec2;
    private Conexao con;
    
    public ClassCliente(){
        this.con = new Conexao();
    }

    public ClassCliente(Integer codc, String cnpjcpfc, String razaoc) {
        this.codc = codc;
        this.cnpjcpfc = cnpjcpfc;
        this.razaoc = razaoc;
        this.con = new Conexao();
    }
    
    
    public ClassCliente(Integer codc, String cnpjcpfc, String nomeFantasiac, String razaoc, String enderecoc, Integer numeroc,String cepc, String cidadec, String estadoc, String contatoc, String telefonec1, String telefonec2) {
        this.codc = codc;
        this.cnpjcpfc = cnpjcpfc;
        this.nomefantansiac = nomeFantasiac;
        this.razaoc = razaoc;
        this.enderecoc = enderecoc;
        this.numeroc = numeroc;
        this.cepc = cepc;
        this.cidadec = cidadec;
        this.estadoc = estadoc;
        this.contatoc = contatoc;
        this.telefonec1 = telefonec1;
        this.telefonec2 = telefonec2;
        this.con = new Conexao();
    }
    
    public boolean inserir(){
        String strSQL = "INSERT INTO Cliente(cnpjcpfc, razaoc, nomefantansiac, enderecoc, numeroc, cepc, cidadec, estadoc, contatoc, telefonec1, telefonec2)" +
                "VALUES('" + this.cnpjcpfc + "', '" + this.razaoc + "', '" + this.nomefantansiac + "', " +
                "'" + this.enderecoc + "', " + this.numeroc + ", '" + this.cepc + "', " +
                "'" + this.cidadec + "', '" + this.estadoc + "', '" + this.contatoc + "', " +
                "'" + this.telefonec1 + "', '" + this.telefonec2 + "')";
        
        System.out.println(strSQL);
        
        return this.con.executar(strSQL);
        //System.out.println(strSQL);
    
    }
    
    public boolean excluir(String codc){
        
     String strSQL = "DELETE FROM cliente WHERE codc ='" + codc + "'";
     
     return this.con.executar(strSQL);
    }   
    
    public boolean reativar(String codc){
     String strSQL = "call mortocliente(" + codc + ")";
     return this.con.executar(strSQL);
    }
    
    public static String consultaCliente(String where){
        String strSQL = "SELECT * FROM cliente WHERE " + where + "1=1";
        return strSQL;
    }
    
    public static String consultaClienteMorto(String where){
        String strSQL = "SELECT * FROM clientem WHERE " + where + "1=1";
        return strSQL;
    }
    
    public boolean editar (){
        String strSQL;
        strSQL = "UPDATE cliente SET cnpjcpfc = '" + this.cnpjcpfc + "', razaoc = '" + this.razaoc + "' " +
                " , nomefantansiac = '" + this.nomefantansiac + "'  , enderecoc = '" + this.enderecoc + "' " +
                " , numeroc= " + this.numeroc + " , cepc = '" + this.cepc + "' , cidadec = '" + this.cidadec + "' " +
                " , estadoc = '" + this.estadoc + "' , contatoc = '" + this.contatoc + "' " +
                " , telefonec1= '" + this.telefonec1 + "' , telefonec2 = '" + this.telefonec2 + "' " +
                " WHERE codc ='" + codc + "'";
        
        return this.con.executar(strSQL);
    }
    
}