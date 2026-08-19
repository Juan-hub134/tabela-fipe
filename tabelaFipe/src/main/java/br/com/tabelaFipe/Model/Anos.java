package br.com.tabelaFipe.Model;

public record Anos(String codigo, String nome ) implements Comparable<Anos>{
    @Override
    public int compareTo(Anos modeloComparacao) {
        return this.codigo.compareTo(modeloComparacao.codigo);
    }

    @Override
    public String toString() {
        return "Ano: "+  " Nome = " + nome +" | "+" Código = " + codigo + "\n";
    }
}
