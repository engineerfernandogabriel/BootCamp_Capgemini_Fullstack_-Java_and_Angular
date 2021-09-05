package capgemini.dio.comparator;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleListComparator {
    public static void main(String[] args){

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add( new Estudante("Pedro", 19));
        estudantes.add( new Estudante("Carlos", 23));
        estudantes.add( new Estudante("Mariana", 21));
        estudantes.add( new Estudante("João", 18));
        estudantes.add( new Estudante("Thiago", 20));
        estudantes.add( new Estudante("George", 22));
        estudantes.add( new Estudante("Larissa", 21));

        System.out.println(" ---- ORDEM DE INSERÇÃO ---- ");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        // Ordena os objetos na lista em ordem crescente usando o parametro idade
        // Sintaxe Lambda

        System.out.println(" ---- ORDEM CRESCENTE DAS IDADES ---- ");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        // Ordena os objetos na lista em ordem decrescente pelo paramêtro da idade
        // Sintaxe Lambda

        System.out.println(" ---- ORDEM DECRESCENTE DAS IDADES ---- ");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        // Ordena os objetos na lista em ordem crescente usando o parâmetro idade

        System.out.println( " ---- ORDEM CRESCENTE DOS NÚMEROS - IDADE (método referência) ---- ");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        // Ordena os objetos na lista em ordem decrescente pelo paramêtro da idade

        System.out.println(" ---- ORDEM DECRESCENTE DOS NÚMEROS - IDADE (método referência) ---- ");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println(" ---- ORDEM CRESCENTE DOS NÚMEROS - IDADE (interface Comparable ");
        System.out.println(estudantes);

    }
}
