package c18743045;
import ie.tudublin.*;

public class Instruments extends Visual{

    Loadscreen ls;
    Message me;
    
    Propeller pr;
    
    PianoStrands strands;
    Revolutions re;
    
    public void settings(){
        size(1600,900,P3D);
    }
    
    public void setup(){
        startMinim();
        loadAudio("King.mp3");
        colorMode(HSB);
        ls = new Loadscreen(this);

        me = new Message(this);
        pr = new Propeller(this);
        
        strands = new PianoStrands(this);
        re = new Revolutions(this);

    }
    //for re
	public float noiseMax;

    int state = 0;

    //for switching between instruments 
    public void keyPressed()
    {
        if (key == ' '){
            getAudioPlayer().play();
            state = 1;
        }
          
        if (key == '3'){
            state = 1;
        }

        if (key == '1'){
            state = 2;
        }

        if (key == '2'){
            state = 4;
        }

        if (key == 'x'){
            getAudioPlayer().pause();
            state = 7;
        }

        if (key == 'i'){
            state = 5;
        }


    }
    
    public void mouseClicked() {
        //state = (int) random(1, 5);
      }

    public void draw()
    {   
        calculateAverageAmplitude();
        
        //callling all instruments as required 
        if(state == 0){
            //ls.render();
            me.render();
        }

        if (state == 1){
            strands.render();
        }

        if (state == 2){
            re.render();
        }

        if(state == 4){
            pr.render();
        }

        if(state == 5){
            me.render();
        }

        if(state == 7){
            ls.render();
        }

    }
}