package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class invoeren extends Applet {
    TextField tekstvak;
    String tekst1;
    String tekst2;
    double uit,in;



    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new TekstvakListener());

        tekst1 = "";
        tekst2 = "";

        add(tekstvak);

    }

    public void paint(Graphics g) {
       g.drawString(tekst1 + "hoogste getal", 50,50);
       g.drawString(tekst2 + "laagste getal", 50,70);

    }
    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            in = Double.parseDouble(s);
            if (in > uit){
                uit = in;
                tekst1 = String.valueOf(in);

            }
            else {
                tekst2 = String.valueOf(in);

            }
            repaint();
        }
    }
}