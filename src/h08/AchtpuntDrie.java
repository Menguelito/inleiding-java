package h08;
import  java.awt.*;
import java.applet.*;

public class AchtpuntDrie extends Applet{
    TextField artiekel, btwperc;
    Button bereken;
    double prijs,intbtwperc,btwwaarde,totaal;
    String strPrijs,strBtw,strTotaal,strBtwwaarde;
    Double hulp;

    public void init()
    {
        artiekel=new TextField(10);
        btwperc=new TextField(6);
        bereken=new Button("Bereken");
        add(artiekel);
        add(btwperc);
        add(bereken);
        artiekel.setText("0");
        btwperc.setText("19");
        bereken();
    }

    public void bereken()
    {
        strPrijs=artiekel.getText();
        strBtw=btwperc.getText();
        hulp=Double.valueOf(strPrijs);
        prijs=hulp.doubleValue();
        hulp=Double.valueOf(strBtw);
        intbtwperc=hulp.doubleValue();
        btwwaarde=(prijs/100)*intbtwperc;
        totaal=prijs+btwwaarde;
        strBtwwaarde=String.valueOf(btwwaarde);
        strTotaal=String.valueOf(totaal);
    }

    public void paint( Graphics g )
    {
        g.drawString("BTW Bedrag is: "+strBtwwaarde,20,80);
        g.drawString("Prijs incl. "+strBtw+"% BTW: "+strTotaal,20,100);
    }

    public boolean action( Event e, Object o)
    {
        if ((e.target==bereken) || (e.target==artiekel))
        {
            bereken();
            repaint();
            return true;
        }
        return false;
    }
}