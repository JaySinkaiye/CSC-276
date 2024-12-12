package HW6;

public class Guitar extends Instrument implements Playable {

    Guitar(){
        super("Guitar");
    }
    @Override
    public void play() {
       System.out.println("Strumming the Guitar\n");
    }

}
