package h02.sample;

import java.applet.Applet;
import java.awt.*;

public class Controller extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Menguelito Mangnoesing", 50, 60 );
        g.setColor(Color.blue);
        g.fillRect(200,200,300,100);
        g.drawRect(200,300,300,100);

    }
}


