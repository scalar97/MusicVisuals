package c18743045;
import processing.core.PApplet;

public class PianoStrands {
    Instruments  in;
    
    

    public PianoStrands( Instruments in){
        this.in = in;
    }


    public void render() {
        float strings = (60 * in.getAmplitude());

        in.background(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 0, 292), 255, 242);

        //strand affects the number of strands drawn as it depends on the amplitude of the sound wave the song outputs 
        //also sets the current strand we are working on for next loop until it finishes the strand
        for (int strand = 0; strand < strings ; strand++) {
              
            //starts custom shape ie the strand  
            in.beginShape();
            
            //loop for x cordinate of each vertex goes from one side 0 to width - 1
            //& connects them as the y offset value doesn't change until next iteration 
            //with the change of strand 
            //hence the vertices end up forming the strand for the current amplitude
            for (int x = 0; x < in.width ; x++){
            
                //x offset to allow ajustment in y value of each vertex of each strand the value is so small to create a more natural looking shape 
                //so the y value of each vertex in a strand isn't to far away from the preinous vertex 
                float xoff = x * 0.0009f;
                //y offset to allow ajustment in y value of each vertex of each strand 
                //so the space between a new strand & a preinous strand is insible
                float yoff = strand;
                //z offset to allow ajustment in y value of each vertex of each strand, frame count is slowed to show the strands being drawn
                float zoff = in.frameCount * 0.009f;

                //value generated by noise function is too small & 
                //is being mapped to the screens values for drawing the vertex
                float y = PApplet.map(in.noise(xoff, yoff, zoff), 0, 1, 0, in.height);
                
                in.stroke(PApplet.map(in.getSmoothedAmplitude(), 0, 1, 22, 242), 255, 255);
                in.strokeWeight(4);
            
                in.vertex(x, y);
                in.noFill();
            }
            in.endShape();
        }
    }
    
}