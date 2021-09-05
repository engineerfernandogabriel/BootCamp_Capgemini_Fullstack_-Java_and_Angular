package capgemini.dio;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

        public static void main(String[] args){

            TreeMap<String, String> treeCapitais = new TreeMap<>();

            treeCapitais.put("RS", "Porto Alegre");
            treeCapitais.put("SC", "Florianópolis");
            treeCapitais.put("PR", "Curitiba");
            treeCapitais.put("SP", "São Paulo");
            treeCapitais.put("RJ", "Rio de Janeiro");
            treeCapitais.put("MG", "Belo Horizonte");

            System.out.println(treeCapitais);

            System.out.println(treeCapitais.firstKey());
            // Retorna a primeira posição no topo da árvore

            System.out.println(treeCapitais.lastKey());
            // Retorna a última posição no final da árvore

            System.out.println(treeCapitais.lowerKey("SC"));
            // Retorna o primeiro valor abaixo na árvore do parametro

            System.out.println(treeCapitais.higherKey("SC"));
            // Retorna o primeiro valor acima na árvore do parametro

            System.out.println(treeCapitais);

            System.out.println(treeCapitais.firstEntry().getKey() + " -- " + treeCapitais.firstEntry().getValue());
            // Retorna as posições do topo da árvore

            System.out.println(treeCapitais.lastEntry().getKey() + " -- " + treeCapitais.lastEntry().getValue());
            // Retorna as últimas posições no final da árvore

            System.out.println(treeCapitais);

            System.out.println(treeCapitais.size());
            // Retorna o tamanho da árvore

            Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
            // Apresenta e retira a primeira posição da árvore

            Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
            // Apresenta e reitra a última posição da árvore

            System.out.println(treeCapitais);

            System.out.println("Tamanho da árvore após a exclusão: " + treeCapitais.size());
            // Retorna o tamanho da árvore

    }
}
