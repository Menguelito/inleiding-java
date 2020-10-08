package h12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Praktijk extends Applet{
    Label naam;
    Label nummer;
    TextField naaminput;
    TextField nummerinput;
    Button okknop;
    Button resetknop;
    int teller;
    String snaam,snummer;
    String[] namen;
    boolean genoegnummers;

    public void init() {
        setSize(800,400);
        genoegnummers = false;

        naam = new Label("Naam Persoon");
        nummer = new Label("Telefoonnummer Persoon");

        naaminput = new TextField(20);
        nummerinput = new TextField("",20);

        naaminput.addActionListener(new OkKnopListener());
        nummerinput.addActionListener(new OkKnopListener());

        okknop = new Button("OK");
        okknop.addActionListener(new OkKnopListener());
        resetknop = new Button("RESET");
        resetknop.addActionListener(new ResetKnopListener());

        namen = new String[10];

        add(naam);
        add(naaminput);
        add(nummer);
        add(nummerinput);
        add(okknop);
        add(resetknop);

        Arrays.fill(namen, "");
    }
    public void paint(Graphics g) {
        int y = 50;
        for (String namen : namen) {
            g.drawString(namen, 60, y+=15);
        }
    }
    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            snaam = naaminput.getText().toLowerCase();
            snummer = nummerinput.getText();
            if (teller < namen.length) {
                namen[teller]="Naam: " + snaam + "    Telefoon Nummer: " + snummer;
                teller++;
                System.out.println("Nummers toegevoegd "+ teller);
                /* Bepalen of er 10 nummers in staan */
                if (teller == namen.length) {
                    genoegnummers = true;
                }
            }
            if (genoegnummers) {
                Arrays.sort(namen);
                repaint();
            }
            naaminput.setText("");
            nummerinput.setText("");
        }
    }

    class ResetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Arrays.fill(namen,"");
            teller = 0;
            genoegnummers = false;
            repaint();
        }
    }
}
