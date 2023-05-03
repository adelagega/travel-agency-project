package model;

import java.util.List;

public class Destination {

    private String name;
    private List<String> attractions;

    public Destination(String name, List<String> attractions) throws AttractionNotFoundException{
        this.name = name;
        if(attractions != null){
            for(String attraction : attractions){
                if(attraction==null){
                    throw new AttractionNotFoundException();
                }
            }
        }
        this.attractions = attractions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<String> attractions) {
        this.attractions = attractions;
    }
}
