package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {
    public static void main(String[] args) {
        // inimigo
        Inimigo inimigo = new Inimigo("Golem", 300, 15);
        Inimigo inimigo2 = new Inimigo("Chupacabra", 130, 23);

        // jogador
        Jogador jogador = new Jogador("DarkSouls", 250, 22);

        // luta
        Luta luta = new Luta(jogador, inimigo);
        luta.lutar(true);
        luta.lutar(true);

        Luta luta2 = new Luta(jogador, inimigo2);
        luta2.lutar(true);
        luta2.lutar(true);
        luta2.lutar(true);
        luta2.lutar(true);
        luta2.lutar(true);
        luta2.lutar(true);

        jogador.cura();
        jogador.status();

        jogador.pocaoDeDano();

    }

}
