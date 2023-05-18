package br.newtonpaiva.domain;

import java.math.BigDecimal;

public class DescontoOrcamentoComMaisDeTresItens extends Desconto{


    public DescontoOrcamentoComMaisDeTresItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 3){
            return orcamento.getValorOrcamento().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcular(orcamento);
    }
}
