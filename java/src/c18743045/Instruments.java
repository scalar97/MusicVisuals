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

    int state = 0;

    public void keyPressed()
    {
        if (key == ' '){
            getAudioPlayer().play();
        }

        if (key == 'x'){
            getAudioPlayer().pause();
        }

    }
    
    public void mouseClicked() {
        state = 1;
      }

    public void draw()
    {   
        calculateAverageAmplitude();
        ls.render();

        if (state == 1){
            strands.render();
        }

    }
}