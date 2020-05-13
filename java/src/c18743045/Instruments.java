package c18743045;
import ie.tudublin.*;

public class Instruments extends Visual{

    Loadscreen ls;

    PianoStrands strands;

    public void settings(){
        size(1600,900,P3D);
    }
    

    public void setup(){
        startMinim();
        loadAudio("King.mp3");
        colorMode(HSB);

        ls = new Loadscreen(this);

        strands = new PianoStrands(this);


    }

    public void draw()
    {   
        calculateAverageAmplitude();
        //ls.render();
        strands.render();
             
    }
}