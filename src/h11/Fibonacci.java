package h11;
import java.awt.*;
import java.applet.*;

public class Fibonacci extends Applet{
    public void init() {

    }

    public void paint(Graphics g) {
        int a = 1;
        int b = 1;
        int y = 30;
        int teller = 0;

        g.drawString(String.valueOf(a),5,15);
        g.drawString(String.valueOf(b),5,30);

        while (teller <=10) {
            a += b;
            b = a-b;
            y += 15;
            g.drawString(String.valueOf(a),5,y);
            teller++;
        }
    }
}

