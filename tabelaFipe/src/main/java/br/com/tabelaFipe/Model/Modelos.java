package br.com.tabelaFipe.Model;

public record Modelos(int codigo, String nome ) implements Comparable<Modelos> {
    @Override
    public String toString() {
        return  "Modelo: "+ " Nome = " + nome +" | "+" Código = " + codigo + "\n";
    }

    @Override
    public int compareTo(Modelos modeloComparacao) {
        return Integer.compare(this.codigo, modeloComparacao.codigo);
    }
}
