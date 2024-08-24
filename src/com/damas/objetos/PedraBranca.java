package com.damas.objetos;

public class PedraBranca extends Pedra {
    public PedraBranca(Casa casa) {
        super(casa, PEDRA_BRANCA);
    }

    @Override
    public boolean pertenceAoJogador(int vez) {
        return vez == 1; // Jogador 2 é o dono das peças brancas
    }

    @Override
    public boolean isTipoValido() {
        return getTipo() == Peca.PEDRA_BRANCA;
    }

    @Override
    public boolean podeComer(Peca peca) {
        return peca instanceof PedraBranca || peca instanceof DamaBranca;
    }
}
