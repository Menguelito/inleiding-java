package h12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class index extends Applet{
    TextField tekstvak;
    Button OKknop;
    int[] getallen;
    boolean gevonden;
    int Zoek;
    int teller;
    String s,tekst;

    public void init() {
        gevonden = false;;
        getallen = new int[100];
        teller = 0;
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new Zoeken());
        OKknop = new Button("OK");
        OKknop.addActionListener(new Zoeken());

        add(tekstvak);
        add(OKknop);
        for(int teller=0; teller < getallen.length; teller++) {
            getallen[teller] = teller;
        }

        tekst = "Vul een getal in en klik op OK";
    }

    public void paint(Graphics g) {
        g.drawString(tekst,20,50);
    }

    class Zoeken implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            Zoek = Integer.parseInt(s);
            teller = 0;

            if (Zoek > getallen.length) {
                tekst = "Het ingevoerde getal: "+ Zoek + " is niet gevonden";
                repaint();
            }

            while(teller<getallen.length) {
                if (getallen[teller] == Zoek) {
                    gevonden=true;
                    tekst = "Het ingevoerde getal: "+ Zoek +" IndexNummer:" + "["+ (teller - 1) +"]"+" is gevonden.";;
                    repaint();
                }
                teller ++;
            }
        }
    }
}
