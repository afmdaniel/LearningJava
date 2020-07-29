package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {
        // adiciona elementos no array colors a listar
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<>();
        
        list.addAll(Arrays.asList(colors)); // adiciona o color ao final da lista
        
        // adiciona elementos no array removeColors em removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();
        
        removeList.addAll(Arrays.asList(removeColors));
        
        // gera saída do conteúdo da lista
        System.out.println("ArrayList: ");
        
        for (int count = 0; count < list.size(); count++){ // poderia usar a instrução for aprimorada
            System.out.printf("%s ", list.get(count));
        }
        
        // remove da lista as cores contidas em removeList
        removeColors(list, removeList);
        
        // gera saída do conteúdo da lista
        System.out.printf("\n\nArrayList after calling removeColors:\n");
        
        list.forEach((color) -> {
            System.out.printf("%s ", color);
        });
        
        System.out.println(); // pular linha
    }
    
    public static void removeColors(Collection<String> collection1, 
            Collection<String> collection2){
        // obtém iterador
        Iterator<String> iterator = collection1.iterator();
        
        // loop enquanto a coleção tiver itens
        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())){
                iterator.remove(); // remove o elemento atual
            }
        }
        
    }
    
}
