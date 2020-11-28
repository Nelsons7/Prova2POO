package br.edu.iftm.rpg;

public class Inimigo {
    // atributos
    private String nome;
    private int vida;
    public int dano;

    // construtor
    public Inimigo(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void atacar(Jogador jogador) {

        System.out.println("Golpe do Golem");
        perderVidaInimigo(jogador.getDano());

    }

    public void perderVidaInimigo(int pontos) {
        vida = vida - pontos;
        if (vida <= 0) {
            System.out.println("Foi pro Beleleu!");
        }
    }

    public void status() {
        if (vida > 0) {
            System.out.println(nome + " sua vida é " + vida);
        } else {
            System.out.println(nome + " Foi pro Beleleu!");
        }

    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
}