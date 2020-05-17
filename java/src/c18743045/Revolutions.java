package c18743045;
import processing.core.PApplet;

public class Revolutions {
    Instruments  in;

    public Revolutions(Instruments in) {
        this.in = in;
    }
    float shift = 0;
    
    public void render() {
        
        in.translate(in.width / 2, in.height / 2);
        in.background(0); 

        //helps draw circles depending on amplitude also helps get to noise space 
        in.noiseMax = in.getSmoothedAmplitude()*PApplet.TWO_PI;
    
        //starting revolution shpae around the centre of window
        in.beginShape();
        //loop until TW0_PI to create a full revolution around centre 
        for (float Theta = 0; Theta < PApplet.TWO_PI; Theta += 0.1f) {

            //creating two vaules that naviaget the noise space to help draw vertices
            float xoff = PApplet.map(PApplet.cos(Theta+shift),-1,1,0,in.noiseMax);
            float yoff = PApplet.map(PApplet.sin(Theta+PApplet.QUARTER_PI),-1,1,0,in.noiseMax);

            //mapping noise values to window size values
            float n = PApplet.map(in.noise(xoff,yoff),0,1,0,700);

            //x,y values for vertices for revolution 
            float x = n * PApplet.cos(Theta+PApplet.HALF_PI);
            float y = n * PApplet.sin(Theta+shift);

            in.stroke(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 22, 242), 255, 255);
            in.strokeWeight(4);
            //if noise reaches a certain thershold fill begins 
            if (in.noiseMax>1f){
                in.fill(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 22, 242), 255, 255);
            }//else nofill as is continued 
            else{
                in.noFill();
            }
           //drawing vertices 
            in.vertex(x,y);

        }
        in.endShape(PApplet.CLOSE);

        //used to start at different points in the noise space used HALF_PI for fun 
        shift += PApplet.map(in.noise(0.1f,PApplet.QUARTER_PI),0,1,1f,PApplet.HALF_PI);
    }    
}