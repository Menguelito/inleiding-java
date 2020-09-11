package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.cyan);
        int. x[] = {150,300,225};
        int. y[] = {150,150,25};
        g.drawRect(150,150,150,200);
        g.drawRect(200,200,50,150);
        g.drawOval(200,75,50,50);
        g.drawPolygon(x,y,3);

        
    }
}
