package h04;

import java.awt.*;
import java.applet.*;

public class Praktijkopdr extends Applet{

    public void init(){

    }
    public void paint(Graphics g){
        g.drawLine(25, 90, 120, 90);
        g.drawString("Lijn",25,102);

        g.drawRect(25,20,100,50);
        g.drawString("Rechthoek",25,82);

        g.drawRoundRect(20,120,100,50,30,30);
        g.drawString("Afgeronde Rechthoek",20,180);

        g.setColor(Color.magenta);
        g.fillRect(150,20,100,50);
        g.setColor(Color.BLACK);
        g.drawOval(150,20,100,50);
        g.drawString("Gevulde rechthoek met ovaal",150,82);

        g.setColor(Color.magenta);
        g.fillOval(160,120,100,50);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal",170,180);

        g.setColor(Color.BLACK);
        g.drawOval(350,20,100,50);
        g.setColor(Color.magenta);
        g.fillArc(350,20,100,50,0,45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen",350,82);

        g.setColor(Color.BLACK);
        g.drawOval(350,100,100,100);
        g.drawString("Cirkel",375,210);

    }
}
