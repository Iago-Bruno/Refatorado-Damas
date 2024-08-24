package com.damas.objetos;

public class PedraVermelha extends Pedra {
    public PedraVermelha(Casa casa) {
        super(casa, PEDRA_VERMELHA);
    }

    @Override
    public boolean pertenceAoJogador(int vez) {
        return vez == 2; // Jogador 2 é o dono das peças brancas
    }

    @Override
    public boolean isTipoValido() {
        return getTipo() == Peca.PEDRA_VERMELHA;
    }

    @Override
    public boolean podeComer(Peca peca) {
        return peca instanceof PedraVermelha || peca instanceof DamaVermelha;
    }
}
