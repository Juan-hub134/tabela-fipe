package br.com.tabelaFipe.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Veiculo(String codigo, String nome ) {
    @Override
    public String toString() {
        return  " Nome = " + nome +" | "+" Código = " + codigo + "\n";
    }
}
