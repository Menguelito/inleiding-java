package h04;

import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawPolygon(new int[] {5,35,65}, new int [] {100,20,100}, 3);

    }
}
