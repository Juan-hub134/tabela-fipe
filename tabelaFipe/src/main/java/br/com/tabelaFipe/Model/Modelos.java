package br.com.tabelaFipe.Model;

public record Modelos(int codigo, String nome ) {
    @Override
    public String toString() {
        return  "Modelo: "+ " Nome = " + nome +" | "+" Código = " + codigo + "\n";
    }
}
