package componentesgui;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
    private final JLabel[] label = new JLabel[3];
    
    public LabelFrame(){
        super("Testing JLabel");
        setLayout(new FlowLayout());
        
        // Construtor JLabel com argumento de string
        label[0] = new JLabel("Label with text");
        label[0].setToolTipText("This is label1");
        add(label[0]); // Adiciona label[0] ao JFrame
        
        // Construtor JLabel com string, Icon e argumentos de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("bug1.jpg"));
        label[1] = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label[1].setToolTipText("This is label2");
        add(label[1]); // Adiciona label[1] ao JFrame
        
        label[2] = new JLabel(); // Construtor JLabel sem argumento
        label[2].setText("Label with icon and text at bottom");
        label[2].setIcon(bug);
        label[2].setHorizontalTextPosition(SwingConstants.CENTER);
        label[2].setVerticalTextPosition(SwingConstants.BOTTOM);
        label[2].setToolTipText("This is label3");
        add(label[2]); // Adicional label[2] ao JFrame

    }
    
}
