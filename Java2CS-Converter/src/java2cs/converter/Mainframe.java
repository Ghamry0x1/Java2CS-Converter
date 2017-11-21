
package java2cs.converter;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class Mainframe extends JFrame {
    private final JMenuBar mnuBar = new JMenuBar();
    private final JMenu mnuF = new JMenu("File");
    private final JMenu mnuH = new JMenu("Help");
    private final JMenu mnuC = new JMenu("Credits");
    private final JMenuItem itmC = new JMenuItem("Class");
    private final JMenuItem itmS = new JMenuItem("String");
    private final JMenuItem itmy = new JMenuItem("Youssef Khaled");
    private final JMenuItem itmm = new JMenuItem("Mohamed El Ghamry");
    private final JMenuItem itmma = new JMenuItem("Mariam Ahmed");
    private final JMenuItem itma = new JMenuItem("Ali Mohamed Ali");
    private final JMenuItem itmay = new JMenuItem("Aya Mohamed Samir");
    private final JMenuItem itmh = new JMenuItem("Mostafa Hazem");
    public static JPanel main =new JPanel() ;
    public Mainframe(){
        main.setBorder(new EmptyBorder(15,20,15,20));
        this.add(main);
        this.setJMenuBar(mnuBar);
        mnuBar.add(mnuF);
        mnuBar.add(mnuH);
        mnuBar.add(mnuC);
        mnuF.add(itmC);
        mnuF.add(itmS);
        mnuC.add(itmy);
        mnuC.add(itmm);
        mnuC.add(itma);
        mnuC.add(itmma);
        mnuC.add(itmh);
        mnuC.add(itmay);
        itmy.setEnabled(false);
        itmm.setEnabled(false);
        itmma.setEnabled(false);
        itma.setEnabled(false);
        itmay.setEnabled(false);
        itmh.setEnabled(false);
        Mainmenu();
    }

    private void Mainmenu() {
        main.removeAll();
        JPanel centerpanel = new JPanel();
        JPanel bottompanel = new JPanel();
        JCheckBox box = new JCheckBox("Sounds");
        JPanel convertpanel = new JPanel();
        JButton b1 = new JButton("Convert Class");
        JButton b2 = new JButton("Convert String");
        JTextArea area = new JTextArea("About program\n asdaasdasd\n sdaasdasd");
        JTextArea area2 = new JTextArea("Disclamer");
//        JPanel imagepanel = new JPanel();
        this.setTitle("Main Menu");
        main.setLayout(new BorderLayout());
        main.add(area,BorderLayout.NORTH);
        main.add(centerpanel,BorderLayout.CENTER);
        main.add(bottompanel,BorderLayout.SOUTH);
        centerpanel.setLayout(null);
//        centerpanel.add(imagepanel);
        centerpanel.add(b1);
        centerpanel.add(b2);
        main.setBackground(Color.black);
        b1.setBounds(400, 120, 150, 30);
        b2.setBounds(400, 220, 150, 30);
        bottompanel.setLayout(new BorderLayout());
        bottompanel.add(box,BorderLayout.WEST);
        bottompanel.add(area2,BorderLayout.EAST);
        area.setEditable(false);
        area2.setEditable(false);
        //trasparent
        area.setOpaque(false);
        area2.setOpaque(false);
        centerpanel.setOpaque(false);
        bottompanel.setOpaque(false);
        box.setOpaque(false);
        //text color
        area.setForeground(Color.white);
        area2.setForeground(Color.white);
        box.setForeground(Color.white);
    }
    
}
