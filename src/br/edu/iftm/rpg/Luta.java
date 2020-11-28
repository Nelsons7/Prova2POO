package br.edu.iftm.rpg;

public class Luta {

    private Jogador desafiado;
    private Inimigo desafiante;
    // private boolean comecarDesafio;

    public Luta(Jogador Xdesafiado, Inimigo Xdesafiante) {
        this.desafiado = Xdesafiado;
        this.desafiante = Xdesafiante;

    }

    public void lutar(boolean start) {

        if (start) {
            desafiado.atacar(desafiante);
            desafiante.atacar(desafiado);
            desafiado.status();
            desafiante.status();
        }
    }

}