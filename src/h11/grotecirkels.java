package h11;
import java.awt.*;
import java.applet.*;

public class grotecirkels extends Applet{
    public void init() {
        setSize(600,750);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int aantal = 100;
        int x = 0;
        int y = 0;

        while (teller < aantal) {
            x +=5;
            y +=5;
            g.drawOval(20,20,x,y);
            teller++;
        }
    }
}

