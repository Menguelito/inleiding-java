package h12;
import java.awt.*;
import java.applet.*;

public class bepaaldewaarde extends Applet{
    double[] salary= { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double maximum;

    public void init() {
        boolean gevonden = false;
        maximum = salary[0];
        for (int teller=0; teller < salary.length; teller ++) {
            if(salary[teller] > maximum) {
                maximum=salary[teller-1];
                gevonden = true;
                System.out.println("Aantal keer gezocht: " + teller);
            } else if (gevonden && maximum < salary[teller]) {
                gevonden = false;
            }
        }
    }

    public void paint(Graphics g)  {
        g.drawString("Het maximum is: " + maximum, 50, 20);
    }
}
