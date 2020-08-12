package module4.country;

import java.util.ArrayList;

public class District {
    ArrayList <Region> regions;
    String center;

public District( ArrayList <Region> regions, String center){
    this.regions=regions;
    this.center=center;
}

    public   ArrayList <Region>  getRegions() {
        return regions;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public void setRegions(ArrayList <Region> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
