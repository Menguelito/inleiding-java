package h11;
import java.awt.*;
import java.applet.*;

public class Getallen extends Applet{
    public void init() {

    }
    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        while (teller >= 10) {
            y += 20;
            g.drawString(""+teller,20,y);
            teller --;
        }
    }
}
