package h13;
import java.awt.*;
import java.applet.*;

public class Methodemuur extends Applet{
    public void init() {}

    public void paint(Graphics g) {
        tekenMuur(g,5,5);

    }

    void tekenMuur(Graphics g, int heightMuur, int breedteMuur) {
        int teller=0;
        int x, y=20, breedte=50, hoogte=25, breedteEind=25;
        int beginX;
        Color zwart=Color.BLACK;
        Color rood=Color.BLUE;

        while (teller < heightMuur) {
            x=50;
            beginX = 50 + breedteEind;
            if (teller % 2 == 0) {

                for (int i=0; i < breedteMuur; i++) {
                    if (i == 0 || i == breedteMuur-1) {
                        g.setColor(zwart);
                        g.drawRect(beginX,y,breedteEind,hoogte);
                        g.setColor(rood);
                        g.fillRect(beginX+1,y+1,breedteEind-1,hoogte-1);
                        beginX = 50* breedteMuur;
                    }

                    else {
                        g.setColor(zwart);
                        g.drawRect(x,y,breedte,hoogte);
                        g.setColor(rood);
                        g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    }
                    x+=breedte;
                }
            } else {
                x= 50+25;
                for (int i = 0; i < breedteMuur-1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x,y,breedte,hoogte);
                    g.setColor(rood);
                    g.fillRect(x+1,y+1,breedte-1,hoogte-1);
                    x += breedte;
                }
            }
            teller++;
            y+=hoogte;
        }
    }
}
