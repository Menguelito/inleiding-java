package h02.sample;

import java.applet.Applet;
import java.awt.*;


public class scratch extends Applet {
    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Menguelito", 50, 60);
        g.setColor(Color.red);
        g.drawString("Mangnoesing", 50,100);


    }
}