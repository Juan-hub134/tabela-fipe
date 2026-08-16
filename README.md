# Tabela FIPE

Aplicação de linha de comando desenvolvida em **Java** para consultar veículos através da **API da Tabela FIPE**, permitindo navegar por tipo de veículo, marca, modelo e ano até chegar às informações detalhadas do veículo escolhido.

O projeto foi desenvolvido como prática de consumo de API, desserialização de JSON e organização de uma aplicação Java em camadas.

## Funcionalidades

* Consulta de marcas de veículos
* Consulta de modelos de uma marca
* Consulta dos anos disponíveis para um modelo
* Consulta das informações do veículo
* Exibição dos resultados no terminal
* Conversão e desserialização das respostas JSON da API

## Tecnologias utilizadas

* Java
* Jackson
* Maven
* API da Tabela FIPE

## Conceitos praticados

Durante o desenvolvimento foram praticados conceitos como:

* Consumo de APIs REST
* Requisições HTTP
* Manipulação de JSON
* Desserialização com `ObjectMapper`
* Uso de `TypeReference`
* Records em Java
* Listas e coleções
* Generics
* Tratamento de exceções
* Separação de responsabilidades entre `View`, `Controller` e `Model`

## Estrutura do fluxo

O fluxo da aplicação segue uma estrutura hierárquica:

```text
Marcas
  └── Modelos
       └── Anos
            └── Informações detalhadas do veículo
```

A aplicação utiliza diferentes `record`s para representar os dados retornados pela API e uma classe responsável pela conversão dos JSONs utilizando o Jackson. Durante o desenvolvimento, um dos principais aprendizados foi lidar com respostas que possuem estruturas diferentes, como listas (`[]`) e objetos (`{}`), escolhendo o tipo adequado para cada desserialização.

## Objetivo

Este projeto faz parte do meu portfólio de estudos em Java e tem como objetivo consolidar conhecimentos sobre consumo de APIs, desserialização de dados e organização de código.

### API

Os dados são obtidos através da API da Tabela FIPE.

## Autor

Desenvolvido por **Juan** como projeto de estudo e portfólio em Java.


