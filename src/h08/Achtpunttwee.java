package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Achtpunttwee extends Applet{
    Button Man;
    Button Vrouw;
    int Reken1, Reken2;


    public void init() {
        Man = new Button("Man");
        Reken1 = 1;
        add(Man);
        Vrouw = new Button("Vrouw");
        Reken2 = 1;
        add(Vrouw);
        Man.addActionListener(new KnopListener());
        Vrouw.addActionListener(new KnopVrouw());

    }

    public void paint(Graphics g) {
        Man.setSize(150,150);
        Man.setLocation(40,50);
        Man.setLabel("Man"+ Reken1);
        Vrouw.setSize(150,150);
        Vrouw.setLocation(300,50);
        Vrouw.setLabel("Vrouw" + Reken2);

    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.print("klik"+ Reken1);
            Reken1++;
            repaint();

        }
    }
    class KnopVrouw implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           System.out.println("klik"+ Reken2);
           Reken2++;
           repaint();

        }
    }
}

