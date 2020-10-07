package h12;
import java.awt.*;
import java.applet.*;

public class tienelementen extends Applet{
    double getallen[];
    double gemiddelde;
    int Counter;

    public void init() {
        getallen = new double[10];
        getallen[0] = 1;
        getallen[1] = 2;
        getallen[2] = 3;
        getallen[3] = 4;
        getallen[4] = 5;
        getallen[5] = 6;
        getallen[6] = 7;
        getallen[7] = 8;
        getallen[8] = 9;
        getallen[9] = 10;

        for (Counter = 0; Counter < getallen.length; Counter++) {
            gemiddelde += getallen[Counter];
        }
        gemiddelde /= Counter;

    }
    public void paint (Graphics g) {
        for (int Counter = 0; Counter < getallen.length; Counter++) {
            g.drawString("" + getallen[Counter], 50,20 * Counter + 20);
            g.drawString("Het gemiddelde is: " + gemiddelde,100,20);
        }
    }
}
