public class Cassette extends Component implements IDoThese {

    int capacity;

    public Cassette(String make, String model, int capacity){
        super(make, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String play(){
        return "I am playing";
    }

    public String pause(){
        return "I am paused";
    }

    public String eject(){
        return "You have ejected this cassette";
    }
}
