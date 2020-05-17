package c18743045;
import processing.core.PApplet;

public class Propeller {

    Instruments  in;
    
    public Propeller( Instruments in){
        this.in = in;
    }
    float shift = 0;

    public void render() {

        //centering & adding varibles 
        in.translate(in.width / 2, in.height / 2);
        in.background(0);

        //starting shapes for propeller 
        in.beginShape();

        //for changing shape that is used in properllar 
        float n = (PApplet.map(in.getSmoothedAmplitude(),0,0.72f,0.01f,9f));
        //navigating similar to revolution but shape changes depending on amplitude
        for (float theta = 0; theta < PApplet.TWO_PI ; theta += (4.5f-n)) {

            //for vertices 
            float x = 450 * PApplet.cos(theta+shift);
            float y = 450 * PApplet.sin(theta+shift);
            in.stroke(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 22, 242), 255, 255);
            in.strokeWeight(4);
            in.fill(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 22, 242), 255, 255);

            in.vertex(x,y);
        }
        in.endShape(PApplet.CLOSE);
        
        //shift for shifting the start of shape in propeller
        shift += PApplet.map(in.noise(0.1f,PApplet.QUARTER_PI),0,1,1f,PApplet.HALF_PI);
    }    
    
}