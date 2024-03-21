/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import jogo.conexao.Conexao;
import jogo.personagem.jogador.Jogador;
import jogo.personagem.NPC.NPC;

/**
 *
 * @author Adm
 */
public class Jogo {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Jogador everton = new Jogador();
        
        everton.setNome("Everton");
        everton.setPontosDeVida(5);
        everton.setArmaEqui(4);
        everton.setClasseArmadura(15);
        everton.setBonuBaseAtaque(2);
        everton.setChanceCritico(20);
        
        NPC goblin = new NPC();
                
        goblin.setNome("Goblin");
        goblin.setPontosDeVida(50);
        goblin.setArmaEqui(4);
        goblin.setClasseArmadura(10);
        goblin.setBonuBaseAtaque(1);
        goblin.setChanceCritico(20);
        
        
        System.out.println(everton.nome + " tem PV - " + everton.getPontosDeVida());
        System.out.println(goblin.nome + " tem: PV - " + goblin.getPontosDeVida());    
        
        System.out.println("TESTE LUTA AUTO");
        everton.batalha(goblin);
        
        
        /**
        Connection con = Conexao.obterConexao();
        PreparedStatement stm = null;
        ResultSet rs = null;
       
        try{
        stm = con.prepareStatement("SELECT * FROM tb_arma WHERE id_arma = 1");
        rs = stm.executeQuery();
        
        while(rs.next()){
            System.out.println(rs.getString("nome_arma"));
            System.out.println(rs.getInt("danoMax_arma"));
        }
        
        }catch(SQLException ex){
            System.out.println("deu pau!!!!");
        }
        */
    }
    
}
