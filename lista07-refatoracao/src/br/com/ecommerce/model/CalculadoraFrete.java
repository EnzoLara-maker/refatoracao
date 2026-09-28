package br.com.ecommerce.model;

import br.com.ecommerce.exception.TipoFreteInvalidoException;

public class CalculadoraFrete {

    // A calculadora não conhece as regras de cada frete: apenas recebe
    // a estratégia já pronta e delega o cálculo (padrão Strategy).
    public double processarFrete(double valorPedido, EstrategiaFrete estrategia) {
        if (estrategia == null) {
            throw new TipoFreteInvalidoException(
                    "Tipo de frete invalido: nenhuma estrategia de frete foi informada.");
        }
        return estrategia.calcular(valorPedido);
    }
}
