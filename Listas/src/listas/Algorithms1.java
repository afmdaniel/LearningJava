package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        // cria e exibe uma List<Character>
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list1 = Arrays.asList(letters); // nesse caso, as mudancas influenciam no vetor
        List<Character> list2 = new ArrayList<>(Arrays.asList(letters)); // nesse caso, as mudancas não influenciam no vetor
        // porque com a palavra-chave new eu estou criando um novo objeto e não apenas uma vizualição em lista do vetor.
        
        System.out.print("Vetor Original: ");
        printaVetor(letters);
        
        Collections.reverse(list1); System.out.println("\nInverti lista1!");
        System.out.print("Vetor: ");
        printaVetor(letters);
        System.out.print("\nLista 1: ");
        printaLista(list1);
        System.out.print("\nLista 2: ");
        printaLista(list2);
        
        Collections.fill(list1, 'D'); System.out.println("\nPreenchi lista1 com 'D'!");
        System.out.print("Vetor: ");
        printaVetor(letters);
        System.out.print("\nLista 1: ");
        printaLista(list1);
        System.out.print("\nLista 2: ");
        printaLista(list2);
    }
    
    private static void printaLista(List<Character> list){
        // OPERADOR FUNCIONAL - USA LAMBDAS
        list.forEach((element) -> {System.out.printf(" %s ", element);});
        System.out.printf("\nMax: %s", Collections.max(list));
        System.out.printf("   Min: %s\n", Collections.min(list));
    }
    
    private static void printaVetor(Character[] vetor){
        System.out.println(Arrays.toString(vetor));
    }
}
