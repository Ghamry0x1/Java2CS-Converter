package java2cs.converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;
public class convertClass extends Mainframe implements ActionListener {
    private JTextArea area = new JTextArea("Title");
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    private JButton back = new JButton("back");   
    private JPanel center = new JPanel();
    public convertClass(){
        super();
        init();
    }

    private void init() {
        Mainframe.main.removeAll();
        Mainframe.main.setLayout(new BorderLayout());
        Mainframe.main.add(area,BorderLayout.NORTH);
        Mainframe.main.add(Mainframe.bottompanel,BorderLayout.SOUTH);
        Mainframe.main.add(center);
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
        Mainframe.bottompanel.remove(area2);
        Mainframe.bottompanel.add(back,BorderLayout.EAST);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o==back){
//            Mainframe.Mainmenu();
            
        }
    }
    
}
