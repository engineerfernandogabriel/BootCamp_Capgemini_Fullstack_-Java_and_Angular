package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();  //cria a lista

        nomes.add("Carlos"); //add - adiciona o nome/item na lista
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes); //o "ln" é para printar e pular uma linha

        nomes.set(2, "Fernanda");  //altera a posição "setada" passar a posição e o item que é para ficar no lugar

        System.out.println(nomes);

        Collections.sort(nomes); //ordena a lista em ordem alfabética

        System.out.println(nomes);

       nomes.remove("Maria"); //remove um item/objeto específico

        System.out.println(nomes);

        String nome = nomes.get(2); //seleciona um nome de uma posição epecífica da lista

        System.out.println("Qual o terceiro no me da lista ? " + nome);

        int tamanho = nomes.size(); //tamanho da lista

        System.out.println("Quantos itens tem na lista ? " + tamanho);

        boolean temFernanda = nome.contains("Fernanda"); //checa se tem o nome na lista e retorna true or false

        System.out.println("Tem Fernanda na lista ? " + temFernanda);

        boolean temGraciela = nome.contains("Graciela"); //checa se tem o nome na lista e retorna true or false

        System.out.println("Tem Graciela na lista ? " + temGraciela);

        boolean listaEstaVazia = nome.isEmpty(); //verifica se a lista está vazia

        System.out.println("Lista esta vazia ? " + listaEstaVazia);

    }
}
