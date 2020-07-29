package listas;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
    
    // cria uma LinkedList, adiciona elementos e converte em array
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
        
        links.addLast("red"); // adiciona como o último item
        links.add("pink"); // adiciona ao final
        links.add(3, "green"); // adiciona ao terceiro indice
        links.addFirst("cyan"); // adiciona como primeiro item
        
        // obtém elementos LinkedList como um array
        colors = links.toArray(new String[links.size()]);
        
        System.out.println("Colors: ");
        
        for (String color : colors)
            System.out.println(color);
    }
}
