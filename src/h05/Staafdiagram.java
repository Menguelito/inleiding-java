package h05;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {

    int Jeroen;
    int Hans;
    int Valerie;
    int Breedte;

    public void init() {

        Jeroen = 50;
        Hans = 100;
        Valerie = 150;
        Breedte = 50;

    }
    
    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(50,100,Breedte,Jeroen);

        g.setColor(Color.blue);
        g.fillRect(100,50,Breedte,Hans);

        g.setColor(Color.cyan);
        g.fillRect(150,0,Breedte,Valerie);

        g.setColor(Color.BLACK);
        g.drawString("Jeroen",150,170);

        g.setColor(Color.black);
        g.drawString("Hans",100,170);

        g.setColor(Color.BLACK);
        g.drawString("Valerie",50,170);




    }
}
