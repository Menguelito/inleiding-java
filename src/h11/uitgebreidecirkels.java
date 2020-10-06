package h11;
import java.applet.*;
import java.awt.*;

public class uitgebreidecirkels extends Applet{
    public void init() {
        setSize(600,600);
    }

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int teller = 0;
        int aantal = 50;

        while (teller < aantal) {
            x +=5;
            y +=5;
            g.drawOval(300-x,300-y,(x*2),(y*2));
            teller ++;
        }
    }
}

