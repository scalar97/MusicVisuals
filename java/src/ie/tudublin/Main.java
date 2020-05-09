package ie.tudublin;

import c18743045.Instrument;
import example.CubeVisual;
import example.MyVisual;
import example.RotatingAudioBands;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Instrument());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}