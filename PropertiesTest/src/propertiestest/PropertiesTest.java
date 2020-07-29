package propertiestest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

    public static void main(String[] args) {
        Properties table = new Properties();
        
        // configura propriedades
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");
        listProperties(table);
        
        // substitui o valor de propriedade
        table.setProperty("color", "red");
        /* 
        *  Object x = table.setProperty("color", "red"); --> o método retorna o valor anterior dessa chave
        *  System.out.println(x); --> nessa caso, retorna blue. Se a chave foi criada agora, o retorno é null
        */

        System.out.println("After replacing properties");
        listProperties(table);
        
        saveProperties(table); 
        
        table.clear(); // tabela vazia
        
        System.out.println("After clearing properties");
        listProperties(table);
        
        loadProperties(table);

        //obtém valor de cor da propriedade
        Object value = table.getProperty("color");
        
        // verifica se o valor está na tabela
        if (value != null)
            System.out.printf("Property color's value is %s\n", value);
        else
            System.out.println("Property color is not in table");
    }

    public static void listProperties(Properties props) {
        Set<Object> keys = props.keySet(); // obtém nome das propriedades

        //gera saídia de pares nome/valor
        for (Object key : keys) {
            System.out.printf("%s\t%s\n", key, props.getProperty((String) key));
        }

        System.out.println("");
    }

    // salva as propriedades em um arquivo
    public static void saveProperties(Properties props) {
        // salva conteúdo de tabela
        try (FileOutputStream output = new FileOutputStream("props.dat")){ // try com recurso. o recurso é fechado automaticamente
            props.store(output, "Sample Properties"); // salva as propriedades
            System.out.println("After saving properties");
            listProperties(props);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // carrega as propriedades de um arquivo
    public static void loadProperties(Properties props) {
        // carrega o conteúdo da tabela
        try (FileInputStream input = new FileInputStream("props.dat")) {
            props.load(input); // carrega propriedades
            System.out.println("After loading properties");
            listProperties(props);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
