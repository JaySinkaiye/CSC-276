package ODA9;

public class InstrumentMain {

    public static void main(String[] args) {
        
        Guitar guitar = new Guitar();
        Drum drum = new Drum();

        guitar.tune();
        guitar.play();
        drum.tune();
        drum.play();

    }

}
