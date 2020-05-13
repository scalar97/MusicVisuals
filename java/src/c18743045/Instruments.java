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

    int counter = 0;
    
    public void keyPressed()
    {
        if (key == ' ' && counter == 0){
            getAudioPlayer().play();
            counter = 1;
        }

        if (key == ' ' && counter == 1){
            getAudioPlayer().pause();
            counter = 0;
        }

    }
    
  



    public void draw()
    {   
        calculateAverageAmplitude();
        //ls.render();
        strands.render();
             
    }
}