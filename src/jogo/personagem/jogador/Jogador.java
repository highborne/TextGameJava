/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.personagem.jogador;
import jogo.Equipamentos.Equipamento;
import jogo.Equipamentos.armaduras.Armadura;
import jogo.Equipamentos.armaduras.Botas;
import jogo.Equipamentos.armaduras.Elmo;
import jogo.Equipamentos.armaduras.Luvas;
import jogo.personagem.Personagem;

public class Jogador extends Personagem {
    private int experienciaAtual;
    private int experienciaProximoNivel;
    private int nivel;
    
    private TipoClasses classe = null;
    
    public Jogador(){  }
}
