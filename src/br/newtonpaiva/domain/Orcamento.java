package br.newtonpaiva.domain;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valorOrcamento;
    private Integer quantidadeItens;

    public Orcamento(BigDecimal valorOrcamento, Integer quantidadeItens) {
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }
}
