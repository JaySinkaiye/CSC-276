package HW6;

public class Drums extends Instrument implements Playable {

    Drums(){
        super("Drums");
    }
    @Override
    public void play() {
       System.out.println("Playing the Piano\n");
    }
}
