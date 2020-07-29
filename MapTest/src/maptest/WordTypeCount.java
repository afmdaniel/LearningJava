package maptest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class WordTypeCount {

    public static void main(String[] args) {
        // cria HashMap para armazenar chaves de Strings e valores Integer
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap);
        displayMap(myMap);
        
        System.out.println(myMap.toString());
    }

    // cria mapa de entrada de usuario
    private static void createMap(Map<String, Integer> map) {
        String input = JOptionPane.showInputDialog("Enter a String");

        // tokeniza a entrada
        String[] tokens = input.split(" ");

        // processamento de texto de entrada
        for (String token : tokens) {
            String word = token.toLowerCase(); // obtém a palavra em letras minúsculas

            // se o mapa contiver a palavra
            if (map.containsKey(word)) {
                // int count = map.get(word); // obtém a contagem atual
                map.put(word, map.get(word) + 1); // incrementa a contagem
            } else { // se nao contiver a palavra
                map.put(word, 1); // adiciona nova palavra com uma contagem de 1 para mapa
            }
        }
    }

    public static void displayMap(Map<String, Integer> map){
        // Set<String> keys = map.keySet(); // obtém chaves
        // classifica as chaves
        //TreeSet<String> sortedKeys = new TreeSet<>(keys);

        Set<String> sortedKeys = new TreeSet<>(map.keySet());
        
        System.out.printf("\nMap contains:\nKey\t\tValue\n");
        
        // gera saída de cada chave no mapa
        for (String key : sortedKeys)
            System.out.printf("%-10s%10s\n", key, map.get(key));
        
        System.out.printf("\nsize: %d\nisEmpty: %b\n", map.size(), map.isEmpty());
    }
}
