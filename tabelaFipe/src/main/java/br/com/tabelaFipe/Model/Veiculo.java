package br.com.tabelaFipe.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Veiculo(String codigo, String nome ) implements Comparable<Veiculo> {
    @Override
    public String toString() {
        return  " Nome = " + nome +" | "+" Código = " + codigo + "\n";
    }
    @Override
    public int compareTo(Veiculo veiculo) {
        return Integer.compare( Integer.parseInt(this.codigo), Integer.parseInt(veiculo.codigo) );
    }
}
