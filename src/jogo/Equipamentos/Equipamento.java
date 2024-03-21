/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.Equipamentos;

import jogo.Equipamentos.armaduras.TipoArmadurasEnum;

public abstract class Equipamento {
    private String nmEquipamento;
    private TipoArmadurasEnum tipoEquipamento;
    private int forca, destreza, constituicao, inteligencia, defesa;

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
