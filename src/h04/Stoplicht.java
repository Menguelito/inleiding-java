package h04;
import java.awt.*;
import java.applet.*;


public class Stoplicht extends Applet{

    public void init(){

    }
    public void paint(Graphics g){
        setBackground(Color.BLACK);

        g.setColor(Color.white);
        g.fillRect(65,150,10,100);

        g.setColor(Color.white);
        g.drawRoundRect(45,50,50,100,10,10);

        g.setColor(Color.red);
        g.fillOval(60,60,20,20);

        g.setColor(Color.orange);
        g.fillOval(60,90,20,20);

        g.setColor(Color.green);
        g.fillOval(60,120,20,20);


    }
}
