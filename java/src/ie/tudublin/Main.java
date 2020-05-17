package ie.tudublin;
import c18743045.Instruments;

public class Main
{	
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Instruments());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}