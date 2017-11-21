
package java2cs.converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class Mainframe extends JFrame implements ActionListener {
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
    public static JPanel bottompanel = new JPanel();
    private JButton b1 = new JButton("Convert Class");
    private JButton b2 = new JButton("Convert String");
    private JButton back = new JButton("back");   
    private JButton back2 = new JButton("back");   
        
        
    public static JTextArea area2 = new JTextArea("Disclamer");
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

    public void Mainmenu() {
        main.removeAll();
        b1.addActionListener(this);
        b2.addActionListener(this);
        JPanel centerpanel = new JPanel();
        JCheckBox box = new JCheckBox("Sounds");
        JPanel convertpanel = new JPanel();
        JTextArea area = new JTextArea("About program\n asdaasdasd\n sdaasdasd");
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
        back.addActionListener(this);
        back2.addActionListener(this);
        main.repaint();
        main.validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o==b1){
            Class();
        }
        else if(o==back){
            bottompanel.remove(back);
            bottompanel.add(area2,BorderLayout.EAST);
            Mainmenu();
        }
        else if(o==back2){
            bottompanel.remove(back2);
            bottompanel.add(area2,BorderLayout.EAST);
            Mainmenu();
        }
        else if(o==b2){
            String();
        }
    }
    public void Class(){
        main.removeAll();
        main.repaint();
        main.validate();
        JTextArea area = new JTextArea("Title");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel center = new JPanel();
        main.setLayout(new BorderLayout());
        main.add(area,BorderLayout.NORTH);
        main.add(bottompanel,BorderLayout.SOUTH);
        main.add(center);
         center.setLayout(new GridLayout(3,0));
        center.add(p1);
        center.add(p2);
        center.add(p3);
        JTextArea a1 = new JTextArea("Source :");
        JTextArea a2 = new JTextArea("Distination :");
        JTextArea path1 = new JTextArea("c/:");
        JTextArea path2 = new JTextArea("c/:");
        JButton b1 = new JButton("Select");
        JButton b2 = new JButton("Set");
        p1.add(a1);
        p1.add(path1);
        p1.add(b1);
        p2.add(a2);
        p2.add(path2);
        p2.add(b2);
        p3.setLayout(null);
        JButton b3 = new JButton("Convert");
        p3.add(b3);
        b3.setBounds(300, 10, 100, 20);
        bottompanel.remove(area2);
        bottompanel.add(back,BorderLayout.EAST);
        main.repaint();
        main.validate();
    }
    
    public void String(){
        main.removeAll();
        main.repaint();
        main.validate();
    JPanel mainPnl;
    JPanel topPnl;
    JPanel bottomPnl;
    JPanel centerPnl;
    JPanel centerTopPnl;
    JPanel centerBottomPnl;
    JPanel centerCenterPnl;
    JTextField titleTxt;
    JTextField javaTxt;
    JTextField csTxt;
    JTextArea javaArea;
    JTextArea csArea;
    JButton convertBtn;
    JButton backBtn;
    JScrollPane javaScrollpane;
    JScrollPane csScrollpane;
        topPnl = new JPanel(); //flow
        bottomPnl = new JPanel(); //flow
        centerPnl = new JPanel(new BorderLayout()); //border        
        centerTopPnl = new JPanel(); //null
        centerTopPnl.setLayout(null);
        centerBottomPnl = new JPanel(); //flow
        centerCenterPnl = new JPanel(new GridLayout(0, 2)); //grid

        titleTxt = new JTextField("Title");
        javaTxt = new JTextField("Java");
        csTxt = new JTextField("C#");
        javaArea = new JTextArea("Enter here your java code to be converted to C#");
        csArea = new JTextArea("C# code appears here");
        convertBtn = new JButton("Convert");
        backBtn = new JButton("Back");
        javaScrollpane = new JScrollPane(javaArea);
        csScrollpane = new JScrollPane(csArea);

        //adding to mainPnl
        main.add(topPnl, BorderLayout.NORTH);
        main.add(bottompanel, BorderLayout.SOUTH);
        main.add(centerPnl, BorderLayout.CENTER);
        bottompanel.remove(area2);
        bottompanel.add(back2,BorderLayout.EAST);
        //adding to topPnl
        topPnl.add(titleTxt);
        
        //adding to centerTopPnl
        centerTopPnl.add(javaTxt);
        centerTopPnl.add(csTxt);
        
        //adding to centerCenterPnl
        centerCenterPnl.add(javaArea);
        centerCenterPnl.add(csArea);
        
        //adding to centerBottom
        centerBottomPnl.add(convertBtn);
        
        //styling
        titleTxt.setEditable(false);
        javaTxt.setEditable(false);
        csTxt.setEditable(false);
        csArea.setEditable(false);
        main.repaint();
        main.validate();

    }
    
    
    
    
}
