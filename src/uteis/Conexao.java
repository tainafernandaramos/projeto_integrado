package uteis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Wendel Pinheiro
 */
public class Conexao 
{
    final private String driver = "com.mysql.jdbc.Driver";
    final private String URL = "jdbc:mysql://localhost:3306/bancoprojetointegrado";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement stmte;
    public ResultSet resultSet ;
    boolean result;
   
    public boolean conectar()
    {
        result = true;
        
        try
        {
           Class.forName(driver);
           conexao = DriverManager.getConnection(URL, usuario, senha);                   
        }
        catch(ClassNotFoundException e)
        {
            result = false;
            JOptionPane.showMessageDialog(null, "Driver não encontrado!");
        }
        catch(SQLException e)
        {
            result = false;
            JOptionPane.showMessageDialog(null, "Fonte de dados não encontrada!");            
            System.out.println(e);
        }
        
        return result;
    }
    
    public void desconectar()
    {
        try
        {
           conexao.close(); 
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar!" + erro);
        }        
    }
    
    public ResultSet pesquisar(String strSQL)
    {
        conectar();

        try
        {
            stmte = conexao.createStatement();
            ResultSet rs = stmte.executeQuery(strSQL);
            desconectar();
            return rs;
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro na execução da query! "+ erro);
            return null;
        }
    }
    
    public boolean executar(String sql)
    {
        conectar();

        result = true;

        try
        {
          stmte = conexao.createStatement();
          stmte.executeUpdate(sql);
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Erro na execução da query! "+ erro);
            result = false;
        }

        desconectar();

        return result;
    }
    
    public void consultar(String sql)
    {
        conectar();

        try
        {
            stmte = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            resultSet = stmte.executeQuery(sql);
        }
        catch(SQLException erro)
        {            
            JOptionPane.showMessageDialog(null, "Erro ao tentar consultar os dados! "+ erro);
        }
    }        
}