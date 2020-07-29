package listas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        // adiciona elementos colors à list1
        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();
        
        list1.addAll(Arrays.asList(colors));
        
        // adiciona elementos colors2 à list2
        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();
        
        list2.addAll(Arrays.asList(colors2));
        
        list1.addAll(list2); // concatena as listas
        list2 = null; // libera recursos
        printList(list1); // imprime elentos list1
        
        convertToUpperCaseString(list1); // converte em string de letras maiúsculas
        printList(list1); // imprime elementos list1
        
        System.out.printf("\nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7); // remove itens 4 a 6 da lista
        printList(list1); // imprime elementos list1
        printReversedList(list1); // imprime lista na ordem inversa
    }
    
    private static void printList(List<String> list){
        System.out.printf("\nList:\n");
        
        list.forEach((color) -> {
            System.out.printf("%s ", color);
        });
        
        System.out.println();
    }
    
    // localiza objetos String e converte em letras maiúsculas
    private static void convertToUpperCaseString(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        
        while (iterator.hasNext()){
            String color = iterator.next(); // obtém item
            iterator.set(color.toUpperCase()); // converte em letras maiúsculas
        }
    }
    
    // obtém sublista e utiliza método clear para excluir itens da sublista
    private static void removeItems(List<String> list, int start, int end){
        list.subList(start, end).clear(); // remove itens
    }
    
    // imprime lista invertida
    private static void printReversedList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size()); // o argumento é a posição inicial do iterador
        
        System.out.printf("\nReversed List:\n");
        
        // imprime lista na ordem inversa
        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }
    
}
