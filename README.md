# Music Visualiser Project


Name: Abdul Shaik
Student Number: c18743045

# Description of the assignment

##This Project is a visualization of King Of Everything by Dominic Fike.
There are 6 new java files/classes that were cretaed for this project.

- Instrument class is the one, which calls for all the other class in its draw function.The screen size & where most of the setup is done, like the ability to switch from instrument (drawing) to another. 
- The PianoStrands file is  my visualization of how the strings inside a piano behave mainly. Also string intruments like the guitar. Sometimes the singers voice as well, nartural movenments dur to the noise function is use.
-The Revolutions file is trying to represent the voice & face maybe natural shapes becaue the noise function is also used here.
-The Propellar is used to represent more rigid objects in the song.
- The Loadscreen file is used when the experiance (music/drawing) is paused.
- The Message file in the screen with all the instuctions how to navigate the the experaince while it is running.

# Instructions

- Compile folder, from Main 
- Instruction Screen appears please Read & Follow e.g. Space to start, X to pause, 1 to load new visual, i for instructions etc..

# How it works

- The code is heavily commented it describes almost every line for every visual please read.
-The main Idea All visuals are ran through Instruments.java in the package C18743045. 
-Every visual that is run is found in this package. Inside this Instruments.java we have constuctors for visuals that are called in setup(). 
-These are needed to create the visuals inside, inside the draw function where all the renders are called for each visual.

Intruments Setup
```Java
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
```

Instruments Draw()
```Java
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
```

The user is expected to switch the above mentioned using keyboard buttons. which have been clearly described in the Instruction menu at the start.

# What I am most proud of in the assignment
I am most pround of the PianoStrand the way the strings move the to music it feels natural & I have tested it on songs its works quite well which took very long to make but is the exaclty as intended which I can't say for all the others but every file was worked on to represent the song best as possible.

# This is a youtube video:
[![YouTube](https://img.youtube.com/vi/8wL6Z_dgDIA/hqdefault.jpg)](https://youtu.be/8wL6Z_dgDIA)
