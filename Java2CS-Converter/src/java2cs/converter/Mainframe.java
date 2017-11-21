package java2cs.converter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Mainframe extends JFrame implements ActionListener {
    private JMenuBar mnuBar = new JMenuBar();
    private JMenu mnuF = new JMenu("File");
    private JMenu mnuH = new JMenu("Help");
    private JMenu mnuC = new JMenu("Credits");
    private JMenuItem itmC = new JMenuItem("Class");
    private JMenuItem itmS = new JMenuItem("String");
    private JMenuItem itmy = new JMenuItem("Youssef Khaled");
    private JMenuItem itmm = new JMenuItem("Mohamed El Ghamry");
    private JMenuItem itmma = new JMenuItem("Mariam Ahmed");
    private JMenuItem itma = new JMenuItem("Ali Mohamed Ali");
    private JMenuItem itmay = new JMenuItem("Aya Mohamed Samir");
    private JMenuItem itmh = new JMenuItem("Mostafa Hazem");
    private JButton b1 = new JButton("Convert Class");
    private JButton b2 = new JButton("Convert String");
    private JButton back = new JButton("back");   
    private JButton back2 = new JButton("back");
    private JPanel main =new JPanel();
    private JPanel bottomPnl = new JPanel();
    private JTextArea area2 = new JTextArea("Disclamer");
    
    private JPanel topPnl;
    private JPanel centerPnl;
    private JPanel centerBottomPnl;
    //private JPanel centerEastPnl;
    //private JPanel centerWestPnl;
    private JPanel centerCenterPnl;
    private JLabel titleTxt;
    private JLabel javaTxt;
    private JLabel csTxt;
    private JTextArea javaArea;
    private JTextArea csArea;
    private JButton convertBtn;
    private JScrollPane javaScrollpane;
    private JScrollPane csScrollpane;
    private JPanel centerCenterCenterPnl;
    private JPanel centerCenterTopPnl;
    
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
        this.setTitle("Main Menu");
        main.setLayout(new BorderLayout());
        main.add(area,BorderLayout.NORTH);
        main.add(centerpanel,BorderLayout.CENTER);
        main.add(bottomPnl,BorderLayout.SOUTH);
        centerpanel.setLayout(null);
        centerpanel.add(b1);
        centerpanel.add(b2);
        main.setBackground(Color.black);
        b1.setBounds(400, 120, 150, 30);
        b2.setBounds(400, 220, 150, 30);
        bottomPnl.setLayout(new BorderLayout());
        bottomPnl.add(box,BorderLayout.WEST);
        bottomPnl.add(area2,BorderLayout.EAST);
        area.setEditable(false);
        area2.setEditable(false);
        //trasparent
        area.setOpaque(false);
        area2.setOpaque(false);
        centerpanel.setOpaque(false);
        bottomPnl.setOpaque(false);
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
    
    public void ClassConverter(){
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
        main.add(bottomPnl,BorderLayout.SOUTH);
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
        bottomPnl.remove(area2);
        bottomPnl.add(back,BorderLayout.EAST);
        main.repaint();
        main.validate();
    }
    
    public void StringConverter(){
        main.removeAll();
        main.repaint();
        main.validate();
        
        topPnl = new JPanel();
        centerPnl = new JPanel(new BorderLayout());
        centerBottomPnl = new JPanel();
        centerCenterPnl = new JPanel(new BorderLayout());
        centerCenterCenterPnl = new JPanel(new GridLayout(0, 2, 10, 0));
        centerCenterTopPnl = new JPanel(new GridLayout(0, 2, 10, 0));
        titleTxt = new JLabel("Title");
        javaTxt = new JLabel("Java");
        csTxt = new JLabel("C#");
        javaArea = new JTextArea("Enter here your java code to be converted to C#");
        csArea = new JTextArea("C# code appears here");
        convertBtn = new JButton("Convert");
        javaScrollpane = new JScrollPane(javaArea);
        csScrollpane = new JScrollPane(csArea);
        
        //adding to mainPnl
        main.add(topPnl, BorderLayout.NORTH);
        main.add(bottomPnl, BorderLayout.SOUTH);
        main.add(centerPnl, BorderLayout.CENTER);
        
        //adding to topPnl
        topPnl.add(titleTxt);
        
        //adding to bottomPnl
        bottomPnl.remove(area2);
        bottomPnl.add(back2,BorderLayout.EAST);
        
        centerCenterPnl.add(centerCenterTopPnl, BorderLayout.NORTH);
        centerCenterPnl.add(centerCenterCenterPnl, BorderLayout.CENTER);
        
        //adding to centerPnl
        centerPnl.add(centerCenterPnl, BorderLayout.CENTER);
        centerPnl.add(centerBottomPnl, BorderLayout.SOUTH);
        
        //adding to centerCenters
        centerCenterTopPnl.add(javaTxt);
        centerCenterTopPnl.add(csTxt);
        centerCenterCenterPnl.add(javaScrollpane);
        centerCenterCenterPnl.add(csScrollpane);
        
        //adding to centerBottom
        centerBottomPnl.add(convertBtn);
        
        //styling
        javaArea.setLineWrap(true);
        csArea.setEditable(false);
    
        main.repaint();
        main.validate();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o==b1){
            ClassConverter();
        }
        else if(o==back){
            bottomPnl.remove(back);
            bottomPnl.add(area2,BorderLayout.EAST);
            Mainmenu();
        }
        else if(o==back2){
            bottomPnl.remove(back2);
            bottomPnl.add(area2,BorderLayout.EAST);
            Mainmenu();
        }
        else if(o==b2){
            StringConverter();
        }
    }
    
}