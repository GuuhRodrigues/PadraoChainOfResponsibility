package br.newtonpaiva.ui;

import br.newtonpaiva.domain.CalculadoraDesconto;
import br.newtonpaiva.domain.Orcamento;

import java.math.BigDecimal;

public class Teste {
    public static void main(String[] args) {

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        Orcamento o1 = new Orcamento(new BigDecimal("1000"), 1);
        Orcamento o2 = new Orcamento(new BigDecimal("100"), 5);

        System.out.println(calculadora.calcular(o1));
        System.out.println(calculadora.calcular(o2));

    }
}
