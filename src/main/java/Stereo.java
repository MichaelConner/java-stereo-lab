import java.util.ArrayList;

public class Stereo {

    private String name;
    private ArrayList<Component> components;

    public Stereo(String name){
        this.name = name;
        this.components = new ArrayList<>();
    }

    public String tune(String channel){
        return channel;
    }

    public ArrayList getComponents(){
        return this.components;
    }




}
