package c18743045;
import processing.core.PApplet;

public class Propeller {

    Instruments  in;
    
    public Propeller( Instruments in){
        this.in = in;
    }
    float shift = 0;

    public void render() {

        in.translate(in.width / 2, in.height / 2);
        in.background(0);
        in.stroke(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 22, 242), 255, 255);
        in.strokeWeight(4);
        in.fill(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 22, 242), 255, 255);

        in.beginShape();

        float n = (PApplet.map(in.getSmoothedAmplitude(),0,0.72f,0.01f,9f));

        for (float theta = 0; theta < PApplet.TWO_PI ; theta += (4.5f-n)) {

            float x = 450 * PApplet.cos(theta+shift);
            float y = 450 * PApplet.sin(theta+shift);

            in.vertex(x,y);

        }
        in.endShape(PApplet.CLOSE);
        shift += PApplet.map(in.noise(0.1f,PApplet.QUARTER_PI),0,1,1f,PApplet.HALF_PI);




    }    

    
}