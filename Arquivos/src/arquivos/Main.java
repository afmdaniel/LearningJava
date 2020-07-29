package arquivos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) throws IOException {
        FIleAndDirectoryInfo app = new FIleAndDirectoryInfo();
        app.setSize(400,400);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        
        
        // CreateTextFile.run();
        // ReadTextFile.run();
    }
    
}
