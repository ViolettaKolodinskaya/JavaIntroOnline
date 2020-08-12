package by.training_epam.module4.aggregation_and_composition.auto;

import java.util.Objects;

public class Wheels
{
   int busWidth;
    int height;
    public enum BussType {
        SUMMER("Summer"), WINTER("Winter");
        final private String type;

        BussType(String type) {
            this.type = type;
        }
            public String getType() {
                return this.type;
            }
        }

    BussType bussType;

    public Wheels(int busWidth, int height, BussType bussType){
        this.busWidth=busWidth;
        this.height=height;
        this.bussType=bussType;
    }

    public BussType getBussType() {
        return bussType;
    }

    public int getBusWidth() {
        return busWidth;
    }

    public void setBussType(BussType bussType) {
        this.bussType = bussType;
    }

    public void setBusWidth(int busWidth) {
        this.busWidth = busWidth;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return  "busWidth: " + busWidth +
        ", height: " + height +
        ", bussType: " + bussType + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(busWidth, height, bussType);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        Wheels wheels=(Wheels) obj;
        return  busWidth==wheels.busWidth&&
        height==wheels.height&&
        bussType==wheels.bussType;
    }
}
