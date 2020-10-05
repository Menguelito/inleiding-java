package h11;
import java.awt.*;
import java.applet.*;

public class Tafels extends Applet{
    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 0;
        int tafel = 3;
        int y = 0;

        while (teller <= 10) {
            y +=22;
            g.drawString((tafel) + "x" + (teller) + "=" + tafel * teller,20,y);
            teller++;
        }
    }
}

