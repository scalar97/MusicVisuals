package c18743045;


public class Loadscreen {
    Instruments  in;

    public Loadscreen( Instruments in){
        this.in = in;
    }
    
    public void render(){
        in.loadPixels();
        
        for (int i = 0; i< in.width; i++){

            for(int j = 0; j < in.height; j++){

                int rand = (int)in.random(255);
                int x = i + j * in.width; 
                in.pixels[x] = rand ;   
            }
        }
        in.updatePixels();
    }
}