package ODA9;

public class Drum extends Instrument{

    Drum(){
        super("Drum");
    }

    @Override
    public void play() {
        System.out.println("The drum is being hit in rythm");
    }
}
