package capgemini.dio;

import java.util.HashMap;
import java.util.Map;

public class ExercicioHashMap {
    public static void main(String[] args){

        Map<String, String> estadosCapitais = new HashMap<>();

        estadosCapitais.put("Acre ", " Rio Branco");
        estadosCapitais.put("Alagoas ", " Maceió");
        estadosCapitais.put("Amapá ", " Macapá");
        estadosCapitais.put("Amazonas ", " Manaus");
        estadosCapitais.put("Bahia ", " Salvador");
        estadosCapitais.put("Ceará ", " Fortaleza");
        estadosCapitais.put("Espírito Santo ", " Vitória");
        estadosCapitais.put("Goiás ", " Goiânia");
        estadosCapitais.put("Maranhão ", " São Luis");
        estadosCapitais.put("Mato Grosso ", " Cuiabá");
        estadosCapitais.put("Mato Grosso do Sul ", " Campo Grande");
        estadosCapitais.put("Minas Gerais ", " Belo Horizonte");
        estadosCapitais.put("Pará ", " Belém");
        estadosCapitais.put("Paraíba ", " João Pessoa");
        estadosCapitais.put("Paraná ", " Curitiba");
        estadosCapitais.put("Pernambuco ", " Recife");
        estadosCapitais.put("Piauí ", " Teresina");
        estadosCapitais.put("Rio de Janeiro ", " Rio de Janeiro");
        estadosCapitais.put("Rio Grande do Norte ", " Natal");
        estadosCapitais.put("Rio Grande do Sul ", " Porto Alegre");
        estadosCapitais.put("Rondônia ", " Porto Velho");
        estadosCapitais.put("Roraima ", " Boa Vista");
        estadosCapitais.put("Santa Catarina ", " Florianópolis");
        estadosCapitais.put("São Paulo ", " São Paulo");
        estadosCapitais.put("Sergipe ", " Aracaju");
        estadosCapitais.put("Tocatins ", " Palmas");

        System.out.println(estadosCapitais);

        System.out.println("Quantos estados tem o Brasil ? " + estadosCapitais.size());
        //Retorna o tamanho do MAp

        estadosCapitais.remove("Minas Gerais ");
        // Remove Minas Gerais do Map

        System.out.println(estadosCapitais);

        System.out.println("Quantos estados tem o Brasil tirando MG ? " + estadosCapitais.size());

        estadosCapitais.put("Distrito Federal ", " DF");
        // Insere o Distrito Federal no Map

        System.out.println(estadosCapitais);

        System.out.println(estadosCapitais.size());
        // Imprimi o tamanho do Map

        estadosCapitais.remove("Mato Grosso do Sul ");

        System.out.println(estadosCapitais);

        System.out.println(estadosCapitais.size());
        //Imprimi o tamanho do Map

        for (Map.Entry<String, String> entry : estadosCapitais.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        // Navega linha a linha com o Map

        boolean temEstado = estadosCapitais.containsKey("Santa Catarina ");
        // Verifica se tem o estado de Santa Caratina no Map

        System.out.println("Tem o Estado de Santa Carinta no Map ? " + temEstado);

        boolean temEstado1 = estadosCapitais.containsKey("Maranhão ");
        // Verifica se tem o estado do Maranhão no Map

        System.out.println("Tem o Estado do Maranhão no Map ? " + temEstado1);

        boolean temEstado2 = estadosCapitais.containsKey("Minas Gerais ");
        // Verifica se tem o estado de Minas Gerais no Map

        System.out.println("Tem o estado de Minas Gerais no Map ? " + temEstado2);
                

    }
}
