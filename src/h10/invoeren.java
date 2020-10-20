package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class invoeren extends Applet {
    TextField tekstvak;
    String tekst1;
    String tekst2;
    double laag,hoog;



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
            hoog = Double.parseDouble(s);
            if (hoog > laag){
                laag = hoog;
                tekst1 = String.valueOf(hoog);

            }
            else {
                tekst2 = String.valueOf(hoog);

            }
            repaint();
        }
    }
}