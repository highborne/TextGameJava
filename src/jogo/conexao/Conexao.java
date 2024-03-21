package jogo.conexao;

import java.sql.*;

public class Conexao {
    private final static String link = "jdbc:mysql://localhost:3306/bd_jogorpg";
    private final static String usuario = "root";
    private final static String senha = "1111";
    
    public static Connection obterConexao() throws SQLException{
        return DriverManager.getConnection(link, usuario, senha);
    }

       
}
