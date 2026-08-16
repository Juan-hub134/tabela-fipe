package br.com.tabelaFipe.Model;

import java.util.List;
// A API retorna "modelos" e "anos" juntos
// Os "anos" aqui não são específicos de cada modelo
// Depois de escolher o modelo, consultamos seus anos
public record ListaModelosEanos(List<Modelos> modelos, List<Anos> anos ) {
    @Override
    public String toString() {
        return "Modelos e Anos:\n" +
                modelos +  anos  ;
    }
}
