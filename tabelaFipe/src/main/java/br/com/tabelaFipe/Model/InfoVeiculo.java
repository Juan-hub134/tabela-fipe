package br.com.tabelaFipe.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
@JsonIgnoreProperties(ignoreUnknown = true)
public record InfoVeiculo(
        @JsonAlias("Valor")
        String valor,
        @JsonAlias("Marca")
        String marca,
        @JsonAlias("Modelo")
        String modelo,
        @JsonAlias("AnoModelo")
        LocalDate anoModelo,
        @JsonAlias("Combustivel")
        String combustivel,
        @JsonAlias("CodigoFipe")
        String codigoFipe,
        @JsonAlias("MesReferencia")
        String mensagemDeReferencia) {
        @Override
        public String toString() {
                return "Infomações do veículo: " + "\n" +
                        " Valor = " + valor + "\n"+
                        " Marca = " + marca + "\n" +
                        " Modelo = " + modelo + "\n" +
                        " Modelo ano = " + anoModelo + "\n" +
                        " Combustível = " + combustivel + "\n" +
                        " Código fipe = " + codigoFipe + "\n" +
                        " Mensagem de referência = " + mensagemDeReferencia;
        }
}
