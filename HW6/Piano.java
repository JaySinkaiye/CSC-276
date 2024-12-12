package HW6;

public class Piano extends Instrument implements Playable {

    Piano(){
        super("Piano");
    }
    @Override
    public void play() {
       System.out.println("Playing the Piano\n");
    }
}
