package ODA9;

public abstract class Instrument {

    String name;

    Instrument(String name){
        this.name = name;
    }

    public abstract void play();

    public void tune(){
        System.out.println(name + " is being tuned.");
    }

}
