/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Xacar
 */
public class ConexaoPGSQL {
    private static Connection conexao;
    
    public static Connection obterConexao() throws ClassNotFoundException, SQLException{
        String servidor = "localhost:5432";
        String login = "postgres";
        String senha = "57601";
        String nomeBanco = "prova2";
        String url = "jdbc:postgresql://"+servidor+"/"+nomeBanco;
        Class.forName("org.postgresql.Driver");
        conexao =  DriverManager.getConnection(url, login, senha);
        return conexao;
    }
    
}
