package h06;
import java.awt.*;
import java.applet.*;


public class zespunttwee extends Applet {
    int a;
    int b;
    int c;
    int d;
    int jaar;
    int uur;
    int dag;

    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        jaar = (a * b) * c * d;
        uur = a * b;
        dag = (a * b) * c;




    }

    public void paint(Graphics g) {
    g.drawString("de uitkomst van een jaar is:" + jaar,20,20);
    g.drawString("De uitkomst van een uur is:" + uur,40,40);
    g.drawString("De uitkomst van een dag is:" + dag,60,60);
    }
}