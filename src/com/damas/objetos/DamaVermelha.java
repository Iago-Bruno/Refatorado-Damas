package com.damas.objetos;

public class DamaVermelha extends Dama {
    public DamaVermelha(Casa casa) {
        super(casa, DAMA_VERMELHA);
    }

    @Override
    public boolean pertenceAoJogador(int vez) {
        return vez == 2; // Jogador 2 é o dono das peças vermelhas
    }

    @Override
    public boolean isTipoValido() {
        return getTipo() == DAMA_VERMELHA;
    }

    @Override
    public boolean podeComer(Peca peca) {
        return peca instanceof PedraVermelha || peca instanceof DamaVermelha;
    }
}
