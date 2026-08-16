package br.com.tabelaFipe.Model;

public record Anos(String codigo, String nome ) {
    @Override
    public String toString() {
        return "Ano: "+  " Nome = " + nome +" | "+" Código = " + codigo + "\n";
    }
}
