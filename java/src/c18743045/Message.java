package c18743045;
import processing.core.PApplet;

public class Message {

    Instruments  in;

    public Message( Instruments in){
        this.in = in;
    }
    
    public void render(){

        in.frameRate(60);
        in.background(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 0, 360), 255, 255);
        in.fill(in.random(255), in.random(255), in.random(255));
        in.textSize(54);
        in.textAlign(PApplet.CENTER, PApplet.CENTER);
        in.text("\nMORTAL THOU SHALT READ ALL INSTRUCTUCTIONS\nTO ENTER MY INSTRUMENTS ??\\_('_')_/??\n\nPRESS M AT ANY MOMENT TO LOAD THIS MESSAGE AGAIN!\n\nPress SPACE to BEGIN!\nPress 1 to start Reveolutions!\nPress 2 to start Propellers!\n Press 3 to go inside my Piano again!\nPress X TO HALT! STAY CLAM & FULLSCREEN AHEAD!", in.width / 2, in.height / 2);
    }   
    
}