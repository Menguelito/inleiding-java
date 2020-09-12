package h04;

import h02.Applet;
import java.awt.*;

public class Nederlandsevlag extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.black);

        g.setColor(Color.red);
        g.fillRect(100,50,120,30);

        g.setColor(Color.white);
        g.fillRect(100,80,120,30);

        g.setColor(Color.blue);
        g.fillRect(100,110,120,30);

    }
}
