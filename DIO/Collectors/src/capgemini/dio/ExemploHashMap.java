package capgemini.dio;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args){

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5 ); // método put recebe dois argumentos e adiciona no map
        campeoesMundialFifa.put("Alemanha", 4 );
        campeoesMundialFifa.put("Itália", 4 );
        campeoesMundialFifa.put("Uruguai", 2 );
        campeoesMundialFifa.put("Argentina", 2 );
        campeoesMundialFifa.put("França", 2 );
        campeoesMundialFifa.put("Inglaterra", 1 );
        campeoesMundialFifa.put("Espanha", 1 );

        System.out.println(campeoesMundialFifa);

        campeoesMundialFifa.put("Brasil", 6 );
        //Atualiza o valor para a chave brasil

        System.out.println(campeoesMundialFifa);

        System.out.println("Quantos títulos tem a Argentina ? " + campeoesMundialFifa.get("Argentina"));
        // Retorna a quantidade de títulos da Argentina

        System.out.println("A França já foi campeã do mundo ? " + campeoesMundialFifa.containsKey("França"));
        //Retorna se existe ou não um campeão França

        campeoesMundialFifa.remove("França");
        // Remove a França do map

        System.out.println(campeoesMundialFifa);

        System.out.println("Tamando do Map: " + campeoesMundialFifa.size());
        // Retorna o tamanho do map em relação a quantidade de objetos

        System.out.println("A França já foi campeã do mundo ? " + campeoesMundialFifa.containsKey("França"));
        //Retorna se existe ou não um campeão França

        campeoesMundialFifa.put("Brasil", 5);
        // Atualiza o valor de títulos do Brasil no map

        campeoesMundialFifa.put("França" , 2);
        // Insere a França no map

        System.out.println(campeoesMundialFifa);

        System.out.println("Existe uma Seleção pentacampeã ? " + campeoesMundialFifa.containsValue(5));

        System.out.println("Tamando do Map: " + campeoesMundialFifa.size());
        // Retorna o tamanho do map em relação a quantidade de objetos

        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        //Navega nos registros do map

        campeoesMundialFifa.clear();
        // Zera todas as informações do map

        System.out.println("Tamanho do map: " + campeoesMundialFifa.size());
        // Retorna o tamanho do map em relação a quantidade de objetos


    }

}
