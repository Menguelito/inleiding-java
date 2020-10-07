package h12;
import java.awt.*;
import java.applet.*;

public class knoppen extends Applet{
    int aantal[];
    Button knop;
    int teller;

    public void init() {
        aantal=new int[25];

        int y=20;

        for (teller=1; teller <= aantal.length; teller++) {
            knop=new Button("Knop" + teller);
            add(knop);
        }
    }

    public void paint(Graphics g) {

    }
}

