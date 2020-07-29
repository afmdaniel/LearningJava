package settest;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {
        // cria treeSet a partir do array colors
        String[] colors = {"yellow", "green", "black", "tan", "grey",
            "white", "orange", "red", "green"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
        
        System.out.print("Sorted Set: ");
        printSet(tree);
        
        // obtém headSet com base em "orange"
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange"));
        
        // obtém tailSet beseado em "orange"
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));
        
        // obtém primeiro e último elementos 
        System.out.printf("first: %s\n", tree.first());
        System.out.printf("last: %s\n", tree.last());
    }
    
    // envia SortedSet para a saída usando a instrução for aprimorada
    private static void printSet(SortedSet<String> set){
        System.out.println(set.toString());
    }
}
