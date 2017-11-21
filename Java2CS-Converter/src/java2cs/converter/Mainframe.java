
package java2cs.converter;

import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {
    private JPanel main =new JPanel() ;
    public Mainframe(){
        Mainmenu();
        this.add(main);
    }

    private void Mainmenu() {
        JPanel centerpanel = new JPanel();
        JPanel bottompanel = new JPanel();
        JTextArea area = new JTextArea();
        JPanel imagepanel = new JPanel();
        this.setTitle("Main Menu");
        main.setLayout(new BorderLayout());
        main.add(area,BorderLayout.NORTH);
        main.add(centerpanel,BorderLayout.CENTER);
        main.add(bottompanel,BorderLayout.SOUTH);
        centerpanel.setLayout(new FlowLayout());
        centerpanel.add(imagepanel);
        
        
    }
    
}
