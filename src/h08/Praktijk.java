package h08;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijk extends Applet {


    TextField invoervak1, invoervak2, resultaat;
    Button maal, plus, delen, aftrekken;
    double invoergetal1, invoergetal2, resultaatgetal;

    public void init()
    {

        invoervak1 = new TextField( 12 );
        invoervak2 = new TextField( 12 );
        resultaat = new TextField( 12 );

        maal = new Button( "x" );
        maal.addActionListener( new maal() );

        plus = new Button( "+" );
        plus.addActionListener( new plus() );

        delen = new Button( "/" );
        delen.addActionListener( new delen() );

        aftrekken = new Button( "-" );
        aftrekken.addActionListener( new aftrekken() );

        add( invoervak1 );
        add( invoervak2 );
        add( maal );
        add( plus );
        add( delen );
        add( aftrekken );
        add( resultaat );

    }

    class maal implements ActionListener
    {

        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervak2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 * invoergetal2;
            resultaat.setText( "" + resultaatgetal );
        }
    }
    class plus implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervak2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 + invoergetal2;
            resultaat.setText( "" + resultaatgetal );
        }

    }
    class delen implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervak2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 / invoergetal2;
            resultaat.setText( "" + resultaatgetal );
        }

    }
    class aftrekken implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervak2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 - invoergetal2;
            resultaat.setText( "" + resultaatgetal );
        }

    }
}