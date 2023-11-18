APLICAÇÃO

Esta aplicação serve para jogadores de RPG, ela se baseia nos dados que utilizam no jogo. Na aplicação, você pode designar qual a quantidade de lados o dado que você deseja rolar possua, assim que digitar, poderá rolar o dado resultando em algum valor que esteja presente nesse dado.


JAVA

A parte do código em JAVA é uma aplicação Spring Boot que contém um controlador Rest (RolagemController).
 A classe principal (ProjetoDadosApplication) é marcada como @SpringBootApplication, indicando que é a classe principal da aplicação Spring Boot.
 A aplicação possui um método main que inicia a aplicação Spring Boot. 
RolagemController é um controlador Rest que mapeia a URL "/rolar-Dados" para o método rolarDados.
 O método rolarDados aceita um parâmetro da consulta chamado "NumeroDeLados" e retorna um número aleatório entre 1 e o valor desse parâmetro.


JAVA SCRIPT

A parte do código em JavaScript é utilizado em conjunto com elementos HTML. Ele captura o valor de um campo de input chamado "NumeroDeLados", realiza algumas verificações e gera um número aleatório, exibindo-o em um elemento com id "result". A função rolarDados é chamada quando ocorre algum evento, como o clique em um botão.
