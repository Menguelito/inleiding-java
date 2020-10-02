package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Cijfers extends Applet{
    TextField Tekstvak;
    Label label;
    Button knop;
    double Cijfer;
    String tekst, tekst2,tekst3;

    public void init() {
        Tekstvak = new TextField("",20);
        label = new Label("type je cijfer in en druk op enter");
        knop = new Button("OK");
        knop.addActionListener(new KnopListener());
        Tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        tekst2 = "";

        add(Tekstvak);
        add(label);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(tekst + "Voldoende",50,60);
        g.drawString(tekst2 + "onvoldoende",50,100);
        g.drawString(tekst3 + "Gemiddelde", 50,140);


    }
    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
                String s = Tekstvak.getText();
                Cijfer = Double.parseDouble(s);
                if (Cijfer > 5.5) {
                    tekst = String.valueOf(Cijfer);
                }
                else {
                    tekst2 = String.valueOf(Cijfer);
                }
                repaint();
           }
        }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekst3 = "5.5";
        }
    }
    }
