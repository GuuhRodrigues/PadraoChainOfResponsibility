package br.newtonpaiva.domain;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    private Double desconto;

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoOrcamentoComMaisDeTresItens(
                new DescontoOrçamentoMaiorQueQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
