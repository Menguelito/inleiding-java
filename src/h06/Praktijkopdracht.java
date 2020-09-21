package h06;
import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet{
        double a, b, c, d;
        double uitkomst;



    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst =(int) (5.9+6.3+6.9) / 3 *10/10;


    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is:" + uitkomst ,20,20);;
    }
}
