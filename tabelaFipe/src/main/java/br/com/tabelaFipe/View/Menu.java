package br.com.tabelaFipe.View;

import br.com.tabelaFipe.Controller.ConverterJson;
import br.com.tabelaFipe.Controller.Requisicao;
import br.com.tabelaFipe.Model.Anos;
import br.com.tabelaFipe.Model.InfoVeiculo;
import br.com.tabelaFipe.Model.ListaModelosEanos;
import br.com.tabelaFipe.Model.Veiculo;
import tools.jackson.core.type.TypeReference;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Requisicao requisicao = new Requisicao();
    ConverterJson converterJson = new ConverterJson();
    private String url = "https://parallelum.com.br/fipe/api/v1/";
    public void menu() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("O que você deseja consultar?\n" +"-Carros\n"+ "-Motos\n"+"-Caminhões");
            String escolha = sc.nextLine().toLowerCase();
            escolha = escolha.strip().replaceAll("[ô,õ,ó,ò]", "o");
            url += escolha + "/marcas/";
            String json = requisicao.chamarApi(url);
            List<Veiculo> listaDeVeiculos = converterJson.converteJsonLista(json, new TypeReference<List<Veiculo>>(){});
            Collections.sort(listaDeVeiculos);
            System.out.println(listaDeVeiculos);
            System.out.println("Escolha o código da marca que você deseja consultar?");
            escolha = sc.nextLine();
            url += escolha + "/modelos/";
            json = requisicao.chamarApi(url);
            ListaModelosEanos listaModelosEanos = converterJson.converteJsonLista(json, new TypeReference<ListaModelosEanos>() {
            });
            Collections.sort(listaModelosEanos.modelos());
            Collections.sort(listaModelosEanos.anos());
            System.out.println(listaModelosEanos);
            System.out.println("Escolha o código do modelo para consultar os anos disponíveis para ele:");
            escolha = sc.nextLine();
            url += escolha + "/anos/";
            json = requisicao.chamarApi(url);
            List<Anos> listaDeAnosDeUmModeloEspecifico = converterJson.converteJsonLista(json, new TypeReference<List<Anos>>(){});
            Collections.sort(listaDeAnosDeUmModeloEspecifico);
            System.out.println(listaDeAnosDeUmModeloEspecifico);
            System.out.println("Escolha o código do ano para consultar:");
            escolha = sc.nextLine();
            url += escolha;
            json = requisicao.chamarApi(url);
            InfoVeiculo informacoesVeiculo = converterJson.converteJson(json, InfoVeiculo.class);
            System.out.println(informacoesVeiculo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
