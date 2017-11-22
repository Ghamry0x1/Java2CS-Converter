package java2cs.converter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
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
    private JMenuItem itmC = new JMenuItem("Convert Class");
    private JMenuItem itmS = new JMenuItem("Translate Snippet");
    private JMenuItem itmy = new JMenuItem("Youssef Khaled");
    private JMenuItem itmm = new JMenuItem("Mohamed El Ghamry");
    private JMenuItem itmma = new JMenuItem("Mariam Ahmed");
    private JCheckBox box = new JCheckBox("Sounds");
    private JMenuItem itma = new JMenuItem("Ali Mohamed Ali");
    private JMenuItem itmay = new JMenuItem("Aya Mohamed Samir");
    private JMenuItem itmh = new JMenuItem("Mostafa Hazem");
    private JButton b1 = new JButton("Convert Class");
    private JButton b2 = new JButton("Translate Snippet");
    private JButton back = new JButton("back");   
    private JButton back2 = new JButton("back");
    private JPanel main =new JPanel();
    private JPanel bottomPnl = new JPanel();
    private JTextArea area2 = new JTextArea("This disclaimer informs users that the views, thoughts, and\nopinions expressed in the app belong solely to iONEX Group.");
    private JPanel topPnl;
    private JPanel centerPnl;
    private JPanel centerBottomPnl;
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
    
    private ImageIcon background = new ImageIcon("res/logo.png");
    private JLabel label = new JLabel();
    
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
        
        JPanel centerpanel = new JPanel();
        JTextArea area = new JTextArea("J2CS Converter is a Windows program which accurately converts Java code to C#. It makes it possible\nto translate java class/string into Visual Studio C# class/string.");
        this.setTitle("J2CS Converter");
        main.setLayout(new BorderLayout());
        main.add(area,BorderLayout.NORTH);
        main.add(centerpanel,BorderLayout.CENTER);
        main.add(bottomPnl,BorderLayout.SOUTH);
        
        centerpanel.setLayout(null);
        label.setBounds(-20, -68, 645, 500);
        label.setIcon(background);
        centerpanel.add(label);
        centerpanel.add(b1);
        centerpanel.add(b2);
        b1.setBounds(400, 120, 150, 30);
        b2.setBounds(400, 220, 150, 30);
        
        //adding to bottomPnl
        bottomPnl.setLayout(new BorderLayout());
        bottomPnl.add(box,BorderLayout.WEST);
        bottomPnl.add(area2,BorderLayout.EAST);
        
        //styling
        area.setEditable(false);
        area2.setEditable(false);
        area.setOpaque(false);
        area2.setOpaque(false);
        centerpanel.setOpaque(false);
        bottomPnl.setOpaque(false);
        box.setOpaque(false);
        main.setBackground(Color.black);
        area.setForeground(Color.white);
        area2.setForeground(Color.white);
        box.setForeground(Color.white);
        
        //adding actionListeners
        back.addActionListener(this);
        back2.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        itmC.addActionListener(this);
        itmS.addActionListener(this);
        
        main.repaint();
        main.validate();
    }
    
    public void classTranslator(){
        main.removeAll();
        main.repaint();
        main.validate();
        
        JLabel area = new JLabel("Class Translator");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel center = new JPanel(new GridLayout(3,0));
        JLabel a1 = new JLabel("Source :");
        JLabel a2 = new JLabel("Distination :");
        JTextField path1 = new JTextField("c/:");
        JTextField path2 = new JTextField("c/:");
        JButton b1 = new JButton("Select");
        JButton b2 = new JButton("Set");
        
        main.setLayout(new BorderLayout());
        
        //adding to main
        main.add(area,BorderLayout.NORTH);
        main.add(bottomPnl,BorderLayout.SOUTH);
        main.add(center, BorderLayout.CENTER);
        
        //adding to center
        center.add(p1);
        center.add(p2);
        center.add(p3);
        
        //adding to panels
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
        
        //adding bottom
        bottomPnl.remove(area2);
        bottomPnl.add(back,BorderLayout.EAST);
        
        //styling
        area.setForeground(Color.WHITE);
        center.setOpaque(false);
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        a1.setForeground(Color.WHITE);
        a2.setForeground(Color.WHITE);
        
        main.repaint();
        main.validate();
    }
    
    public void snippetTranslator(){
        main.removeAll();
        main.repaint();
        main.validate();
        
        topPnl = new JPanel();
        centerPnl = new JPanel(new BorderLayout());
        centerBottomPnl = new JPanel();
        centerCenterPnl = new JPanel(new BorderLayout());
        centerCenterCenterPnl = new JPanel(new GridLayout(0, 2, 10, 0));
        centerCenterTopPnl = new JPanel(new GridLayout(0, 2, 10, 0));
        titleTxt = new JLabel("Snippet Translator");
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
        centerPnl.setOpaque(false);
        
        //styling
        javaArea.setLineWrap(true);
        csArea.setEditable(false);
        topPnl.setOpaque(false);
        centerCenterPnl.setOpaque(false);
        centerCenterCenterPnl.setOpaque(false);
        centerCenterTopPnl.setOpaque(false);
        centerBottomPnl.setOpaque(false);
        titleTxt.setForeground(Color.white);
        javaTxt.setForeground(Color.white);
        csTxt.setForeground(Color.white);
    
        main.repaint();
        main.validate();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o==b1){
            classTranslator();
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
            snippetTranslator();
        }
        else if(o==itmC){
            classTranslator();
        }
        else if(o==itmS){
            snippetTranslator();
        }
    }
    
}