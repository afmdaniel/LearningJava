package arraysandstreams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    
    public static void main(String[] args) {
        String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // exibe strings originais
        System.out.printf("Originas strings: %s\n", Arrays.asList(strings));

        // strings em maiúsculas
        System.out.printf("strings in uppercase: %s\n",
                Arrays.stream(strings)
                        .map(String::toUpperCase) // REFERENCIA DE METODO
                        .collect(Collectors.toList()));

        // strings maiores que "n" (sem distinção maiusc/minusc) em ordem crescente
        System.out.printf("strings greater than n sorted ascending: %s\n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                        .collect(Collectors.toList()));
        
        // strings maiores que "n" (sem distinção maiusc/minusc) em ordem decrescente
        System.out.printf("strings greater than n sorted descending: %s\n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("n") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));
        
    }
    
}
