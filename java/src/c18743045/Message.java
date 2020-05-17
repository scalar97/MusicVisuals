package c18743045;
import processing.core.PApplet;

public class Message {

    Instruments  in;

    public Message( Instruments in){
        this.in = in;
    }
    
    public void render(){

        in.frameRate(60);
        in.background(0);
        in.fill(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 0, 360), 255, 255);
        in.textSize(45);
        in.textAlign(PApplet.CENTER, PApplet.CENTER);
        in.text("This a visualization of King Of Everything by DOMINIC FIKE\n\nPLEASE READ ALL THE FOLLOWING INSTRUCTUCTIONS:\n\nPress i at any-moment to view these Instructions again!\n\nPress 1 to switch to Revolutions!\nPress 2 to switch to Propellers!\nPress 3 to switch to Piano again!\nPress x to Pause at any-moment!\nPress Space_Bar to Begin/Play!\n\nHope you enjoy the show!", in.width / 2, in.height / 2);
    }   
    
}