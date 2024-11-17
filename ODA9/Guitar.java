package ODA9;

public class Guitar extends Instrument {

    Guitar(){
        super("Guitar");
    }
     
    @Override
    public void play() {
        System.out.println("The guitar is strumming chords");
    }
}
