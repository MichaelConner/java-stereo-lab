public class CD extends Component implements IDoThese{

    int numberOfCDs;


    public CD(String make, String model, int numberOfCDs){
        super(make, model);
        this.numberOfCDs = numberOfCDs;
    }

    public int getNumberOfCDs() {
        return numberOfCDs;
    }

    public String play(){
        return "I am playing";
    }

    public String pause(){
        return "I am paused";
    }

    public String eject(){
        return "You have ejected these little shiny discs that some people call music circles";
    }

}
