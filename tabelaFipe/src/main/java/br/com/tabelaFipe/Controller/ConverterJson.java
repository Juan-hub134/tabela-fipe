package br.com.tabelaFipe.Controller;


import tools.jackson.core.JacksonException;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;


public class ConverterJson implements IconversaoJson {
    ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public <T> T converteJsonLista(String json, TypeReference<T> tipo) {
        try {
            return objectMapper.readValue(json, tipo);
        } catch (JacksonException e) {
            // exceção importada do jackson caso json venha quebrado
            System.out.println("Json veio quebrado: "+ e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> T converteJson(String json, Class<T> tipo) {

        return objectMapper.readValue(json, tipo);
    }

}
