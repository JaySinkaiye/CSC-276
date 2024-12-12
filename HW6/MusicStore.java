package HW6;

public class MusicStore {

    public void showcase(Instrument instrument){

        System.out.println(instrument.toString());

        if (instrument instanceof Playable){
            ((Playable)instrument).play();
        } else {
            System.out.println("This instrument is not playable");
        }
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Drums drums = new Drums();
        Violin violin = new Violin();

        MusicStore musicStore = new MusicStore();
        musicStore.showcase(guitar);
        musicStore.showcase(piano);
        musicStore.showcase(drums);
        musicStore.showcase(violin);

    }

}
