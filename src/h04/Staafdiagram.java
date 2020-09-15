package h04;

import java.applet.*;
import java.awt.*;

public class Staafdiagram extends Applet{

    public void init(){

    }
    public void paint(Graphics g){

        g.setColor(Color.red);
        g.fillRect(50, 100, 50, 50);

        g.setColor(Color.blue);
        g.fillRect(100, 50,50,100);

        g.setColor(Color.cyan);
        g.fillRect(150,0,50,150);

        g.setColor(Color.black);
        g.drawString("Jeroen", 150,170);

        g.setColor(Color.black);
        g.drawString("Hans", 100, 170);

        g.setColor(Color.black);
        g.drawString("Valerie",50,170);





    }
}
