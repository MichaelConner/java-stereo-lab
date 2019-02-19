public class Cassette {

    String make;
    String model;
    int capacity;

    public Cassette(String make, String model, int capacity){
        this.make = make;
        this.model = model;
        this.capacity = capacity;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}
