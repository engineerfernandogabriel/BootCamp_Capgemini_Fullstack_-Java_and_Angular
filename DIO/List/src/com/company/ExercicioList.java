package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //Lista criada

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Roberto");
        //altera o nome Carlos (posição 2) para Roberto

        System.out.println(nomes);

        String nome1 = nomes.get(1);
        //retorna o nome da posição 1 da lista

        System.out.println(nome1);

        String nome4 = nomes.get(4);
        //retorna o nome da posição 4 da lista

        System.out.println(nome4);

        nomes.remove("João");
        //remove o item "João" da lista

        System.out.println(nomes);

        int tamanho = nomes.size();
        //retorna a quantidade de objetos na lista

        System.out.println("Tamanho da lista ? " + tamanho);

        boolean temJuliana = nomes.contains("Juliana");
        //checa se tem o nome Juliana na lista

        System.out.println("Tem Juliana na lista ? " + temJuliana);

        List<String> nomes2 = new ArrayList<>(nomes);
        //criando uma nova lista mantendo os objetos da lista já criada

        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        System.out.println(nomes2);

        Collections.sort(nomes2);
        //ordena a lista em ordem alfabética

        System.out.println(nomes2);

        boolean listaVazia = nomes2.isEmpty();

        System.out.println("A nova lista está vazia ? " + listaVazia);



    }
}
