package h04;

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.cyan);
        g.drawPolygon(new int[] {15, 35, 60}, new int [] {100, 50, 100}, 3);

        
    }
}
