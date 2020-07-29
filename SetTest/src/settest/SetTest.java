package settest;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        //cria e exibe uma List<String>
        String[] colors = {"red", "white", "blue", "green", "gray", "orange",
            "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        // forma de visualização, qualquer alteração afeta ambos
        // nesse exemplo, ao criar o set, um novo objeto é instanciado, portanto
        // o vetor original não será afetado
        
        System.out.printf("List: %s\n", list);
        
        
        // elimina duplicatas, então imprime os valores únicos
        printNonDuplicates(list);
    }

    // cria um Set de uma coleção para eliminar duplicatas
    private static void printNonDuplicates(Collection<String> values){
        // cria um HashSet
        Set<String> set = new HashSet<>(values);
        
        System.out.printf("\nNonduplicates are: %s\n", set);
    }
    
}
