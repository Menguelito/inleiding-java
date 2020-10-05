package h11;
import java.awt.*;
import java.applet.*;

public class Verticalelijn extends Applet{

    public void init() {

    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 10) {
            x += 30;
            g.drawLine(x , 20, x, 200 );
            teller++;
        }
    }
}

