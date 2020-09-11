package h02.sample;

import java.applet.Applet;
import java.awt.*;

public class Controller extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Menguelito Mangnoesing", 50, 60 );
    }
}


