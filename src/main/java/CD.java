public class CD {

    String make;
    String model;
    int numberOfCDs;


    public CD(String make, String model, int numberOfCDs){
        this.make = make;
        this.model = model;
        this.numberOfCDs = numberOfCDs;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfCDs() {
        return numberOfCDs;
    }
}
