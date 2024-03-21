/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.personagem;

import java.util.*;

public abstract class Personagem {
    public String nome;
    private String tamanho;
    private String tipo;
    private int iniciativa;
    private int chanceCritico;

    private int classeArmadura;
    private int forca, destreza, constituicao, inteligencia, pontosDeVida;
    private int bonuBaseAtaque;
    int armaEqui;
    
    public Personagem() {}
    
    int jogadaDado(int dado){
        int resultado = (1 + (int) (Math.random()*dado));
        
        return resultado;
    }
    
    public void atacar(Personagem inimigo){
        int jogadaAcerto = jogadaDado(20); 
        if(jogadaAcerto >= this.chanceCritico){
            int dano = jogadaDado(this.armaEqui) * 2 + this.forca;
            inimigo.setPontosDeVida(inimigo.getPontosDeVida() - dano);
            System.out.println("Acerto critico!!! Essa doeu." );
            System.out.println(this.nome + " causou " + dano + " em " + inimigo.nome + "\n");
        }
        else if(this.bonuBaseAtaque + jogadaAcerto >= inimigo.classeArmadura){
           int dano = jogadaDado(this.armaEqui) + this.forca;
            inimigo.setPontosDeVida(inimigo.getPontosDeVida() - dano);
            System.out.println("Acertou");
            System.out.println(this.nome + " causou " + dano + " em " + inimigo.nome + "\n"); 
        }
        else{
           System.out.println("Errou \n");
        }
    }
    
    public void batalha(Personagem inimigo){
       int n;
        while(true){
            if(this.pontosDeVida > 0){
              System.out.println("Escolha uma ação: \n1) Atacar.\n2) Usarpoção. \n3) Usar magia especial.");
              Scanner acao = new Scanner(System.in);
              n = acao.nextInt();
              
              switch(n){
                  case 1: this.atacar(inimigo);
                          System.out.println(this.nome + " tem "+  this.pontosDeVida + " pontos vida restantes.");
                          System.out.println(inimigo.nome + " tem " + inimigo.pontosDeVida + " pontos vida restantes.");
                    break;
                  case 2: this.setPontosDeVida(this.pontosDeVida + 50);
                          System.out.println("Usei poção.");
                    break;
                  case 3: System.out.println("Usei ataque especial.");
                    break;
              }
           }else{ System.out.println(this.nome + " Morreu"); break; }
           
           System.out.println("\n");
           if(inimigo.pontosDeVida > 0){
              inimigo.atacar(this);
              System.out.println(this.nome + " tem " + this.pontosDeVida + " pontos vida restantes.");
              System.out.println(inimigo.nome + " tem " + inimigo.pontosDeVida + " pontos vida restantes.");
               
           }else{ System.out.println(inimigo.nome + " Morreu"); break; }
           System.out.println("------------------------------------------------------");
           
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }
    
    public int getChanceCritico() {
        return chanceCritico;
    }

    public void setChanceCritico(int chanceCritico) {
        this.chanceCritico = chanceCritico;
    }
    
    public int getClasseArmadura() {
        return classeArmadura;
    }

    public void setClasseArmadura(int classeArmadura) {
        this.classeArmadura = classeArmadura;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public int getBonuBaseAtaque() {
        return bonuBaseAtaque;
    }

    public void setBonuBaseAtaque(int bonuBaseAtaque) {
        this.bonuBaseAtaque = bonuBaseAtaque;
    }

    public int getArmaEqui() {
        return armaEqui;
    }

    public void setArmaEqui(int armaEqui) {
        this.armaEqui = armaEqui;
    }

}
