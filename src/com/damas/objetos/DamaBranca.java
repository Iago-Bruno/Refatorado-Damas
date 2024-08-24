package com.damas.objetos;

public class DamaBranca extends Dama {
    public DamaBranca(Casa casa) {
        super(casa, DAMA_BRANCA);
    }

    @Override
    public boolean pertenceAoJogador(int vez) {
        return vez == 1; // Jogador 1 é o dono das peças brancas
    }

    @Override
    public boolean isTipoValido() {
        return getTipo() == DAMA_BRANCA;
    }

    @Override
    public boolean podeComer(Peca peca) {
        return peca instanceof PedraBranca || peca instanceof DamaBranca;
    }
}
