package h11;
import java.awt.*;
import java.applet.*;

public class Schaakbord extends Applet{
    public void init(){

    }

    public void paint(Graphics g) {
        int x;
        int y=50;
        int breedte=25;
        int hoogte=25;
        int rij = 0;
        Color wit;
        Color zwart;
        zwart=Color.BLACK;
        wit=Color.WHITE;

        while (rij < 8) {
            x=50;

            if (rij % 2 == 0) {
                for (int kolom=0; kolom < 8; kolom++) {
                    if (kolom % 2 == 0) {
                        g.setColor(zwart);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(wit);
                        g.fillRect(x, y, breedte, hoogte);
                    }
                    x+=breedte;
                }
                rij++;
            } else {
                y+=hoogte;

                for (int kolom=0; kolom < 8; kolom++) {
                    if (kolom % 2 == 0) {
                        g.setColor(wit);
                        g.fillRect(x, y, breedte, hoogte);
                    } else {
                        g.setColor(zwart);
                        g.fillRect(x, y, breedte, hoogte);

                    }
                    x+=breedte;
                }
                rij++;
                y+=hoogte;
            }
        }
        x=50;
        y=50;
        g.drawRect(x,y,x*4,y*4);
    }
}
