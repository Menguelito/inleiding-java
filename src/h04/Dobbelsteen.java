package h04;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet{

    public void init(){

    }
    public void paint(Graphics g){
       setBackground(Color.black);

       g.setColor(Color.white);
       g.fillRoundRect(50,50,100,100,10,10);

       g.setColor(Color.black);
       g.fillOval(60,60,25,25);

       g.setColor(Color.black);
       g.fillOval(110,60,25,25);

       g.setColor(Color.BLACK);
       g.fillOval(60,110,25,25);

       g.setColor(Color.BLACK);
       g.fillOval(110,110,25,25);


    }
}
