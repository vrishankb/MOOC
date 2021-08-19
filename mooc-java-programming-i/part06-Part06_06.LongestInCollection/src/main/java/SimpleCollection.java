
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        
        if (this.elements.isEmpty()) {
            return null;
        }
        
        String returnObject = this.elements.get(0);
        
        for (String tallest: this.elements) {
            if (tallest.length() > returnObject.length()) {
                returnObject = tallest;
            }
        }
        
        return returnObject;
        
    }

}