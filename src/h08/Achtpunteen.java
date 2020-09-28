package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Achtpunteen extends Applet {
    Button knop;
    String schermtekst;
    TextField tekstvak;
    Label label;
    Button knop1;



    public void init() {
     schermtekst = "doet deze knop het";
        knop = new Button("klik op mij");
    knopListener kl = new knopListener();
    knop.addActionListener(kl);
    add(knop);
    tekstvak = new TextField("schrijf wat jonge",20);
    add(tekstvak);
    label = new Label("type iets hierin");
    add(label);
    schermtekst = "";
    knop1 = new Button("Reset");
    knop1.addActionListener(e -> tekstvak.setText(""));
    add(knop1);




    }

    public void paint(Graphics g) {
        g.drawString(schermtekst, 50 , 50);

    }
    class knopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            schermtekst = tekstvak.getText();
            repaint();


        }
    }
}

