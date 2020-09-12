package h04;

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(100, 50, 150, 150);
        g.drawLine(200, 50, 150, 150);

    }

    public static void drawFloors(Graphics g){

        g.setColor(Color.blue);
        g.drawRect(200,200,300,100);


    }
}
