package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploListComparator {
    public static void main(String[] args){

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
        // Adiciona estudantes a coleção

        System.out.println("Contagem: " + estudantes.stream().count());
        // Retorna a contagem dos elementos da stream

        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        // Retorna o elemento com o maior número de letras

        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
        // Retorna o elemento com o menor número de letras

        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
        // Retorna somente os 3 (parâmetro) primeiros elementos da lista

        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        // Exibe cada elemento no console e depois retorna a mesma coleção

        estudantes.stream().forEach(System.out::println);
        // Exibe cada elemento no console sem retornar outra coleção

        System.out.println("Todos os elementos contém letra W no nome ? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));
        // Retorna true se todos os elementos possuem a letra (parâmetro) no nome

        System.out.println("Algum elemento tem a letra a minúsculo no nome ? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
        // Retorna true se algum elemento possuir a letra (parâmetro) no nome

        System.out.println("Não tem nenhum elemento com 'a minúsculo' no nome ? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));
        // Retorna true se nenhum elemento possur a letra (parâmetro) no nome

        estudantes.stream().findFirst().ifPresent(System.out::println);
        // Retorna o primeiro elemento da lista

    }
}
