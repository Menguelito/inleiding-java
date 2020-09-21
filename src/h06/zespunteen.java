package h06;
import java.applet.*;
import java.awt.*;

public class zespunteen extends Applet{
    double a,b,c,uitkomst,d,e ;

    public void init() {
        a = 113;
        c = 4;
        uitkomst = a / c;

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst,20,20);
    }
}
