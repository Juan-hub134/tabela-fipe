package br.com.tabelaFipe.Controller;


import tools.jackson.core.type.TypeReference;

public interface IconversaoJson {
    <T> T converteJsonLista(String json, TypeReference<T> tipo);
    <T> T converteJson(String json, Class<T> tipo);
}
