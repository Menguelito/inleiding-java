package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Maandnummer extends Applet {
    TextField tekstvak;
    Label label2;
    TextField tekstvak2;
    Label label;
    String s, tekst, tekst2, s2;
    int dag;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";

        tekstvak2 = new TextField("", 20);
        label2 = new Label("Type het jaartal en druk op enter");
        tekst2 = "";
        tekstvak2.addActionListener(new Jaartal());

        add(tekstvak2);
        add(label2);
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 70);
        g.drawString(tekst2, 50, 120);

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "januari = 30 dagen";
                    break;
                case 2:
                    tekst = "februari = 28/29 dagen";
                    break;
                case 3:
                    tekst = "maart = 31 dagen";
                    break;
                case 4:
                    tekst = "april = 30 dagen";
                    break;
                case 5:
                    tekst = "mei = 31 dagen";
                    break;
                case 6:
                    tekst = "juni = 30 dagen";
                    break;
                case 7:
                    tekst = "juli = 31 dagen";
                    break;
                case 8:
                    tekst = "augustus = 31 dagen";
                    break;
                case 9:
                    tekst = "september = 30 dagen";
                    break;
                case 10:
                    tekst = "oktober = 31 dagen";
                    break;
                case 11:
                    tekst = "november = 30 dagen";
                    break;
                case 12:
                    tekst = "december = 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;


            }
            repaint();
        }
    }
    class Jaartal implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s2 = tekstvak2.getText();
            jaartal = Integer.parseInt(s);
            if (  (jaartal% 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ){
                tekst2 = "" + jaartal + "is een schrikkeljaar";

            }
            else {
                tekst2 = "" + jaartal + "is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
