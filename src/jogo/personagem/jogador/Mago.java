/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.personagem.jogador;

import jogo.Equipamentos.Armas.Cajado;

public class Mago extends Jogador {
    public Mago(){
        super(TipoClasses.MAGO);
    }
    
    private Cajado cajado;
}
