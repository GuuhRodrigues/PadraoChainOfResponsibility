package br.newtonpaiva.domain;

import java.math.BigDecimal;

public class DescontoOrçamentoMaiorQueQuinhentos extends Desconto{

    public DescontoOrçamentoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValorOrcamento().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValorOrcamento().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
