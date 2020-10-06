package h11;
import java.awt.*;
import java.applet.*;

public class vijfcirkels extends Applet{
    public void init() {

    }

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int teller = 0;
        int aantal = 5;

        while (teller < aantal) {
            x +=5;
            y +=5;
            g.drawOval(140-x,140-y, (x * 2), (y * 2));
            teller ++;
        }
    }
}

