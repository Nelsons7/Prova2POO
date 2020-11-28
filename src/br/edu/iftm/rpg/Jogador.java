package br.edu.iftm.rpg;

public class Jogador {

    // atributos
    private String nome;
    private int vida;
    private int dano;
    private int cura = 50;
    private int pocaoDano = 35;

    // construtor
    public Jogador(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    public void atacar(Inimigo inimigo) {
        System.out.println("Espada Flamejante dano " + dano);
        perderVidaJogador(inimigo.dano);

    }

    public void perderVidaJogador(int pontos) {
        vida = vida - pontos;
        if (vida <= 0) {
            System.out.println("Perdeu Playboy!");
        }
    }

    public void status() {
        if (vida > 0) {
            System.out.println(nome + " sua vida é " + vida);
        } else {
            System.out.println(nome + " Perdeu Playboy!");
        }

    }

    public void cura() {
        vida = vida + cura;
        System.out.println("Sua vida foi recuperada em " + cura);

    }

    public void pocaoDeDano() {
        dano = dano + pocaoDano;
        System.out.println("Seu dano foi aumentado para " + dano);

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
     * @return int return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * @param dano the dano to set
     */
    public void setDano(int dano) {
        this.dano = dano;
    }

}