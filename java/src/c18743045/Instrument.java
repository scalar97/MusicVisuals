package c18743045;
import ie.tudublin.*;

public class Instrument extends Visual{

    Loadscreen ls;

    public void settings(){
        size(1600,900,P3D);
    }
    

    public void setup(){
        startMinim();
        //loadAudio("king.mp3";)
        colorMode(HSB);

        ls = new Loadscreen(this);

    }

    public void draw()
    {   
        //calculateAverageAmplitude();
        ls.render();
             
    }
}