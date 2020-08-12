package module4.time;

import java.util.Objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        if(hours<0||hours>23){
            this.hours=0;
        }
        else{
            this.hours=hours;
        }

        if(minutes<0||minutes>23){
            this.minutes=0;
        }
        else{
            this.minutes=minutes;
        }
        if(seconds<0||seconds>23){
            this.seconds=0;
        }
        else{
            this.seconds=seconds;
        }
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;

        if(obj==null||getClass()!=obj.getClass()) return false;
        Time time= (Time) obj;
        return hours==time.hours&&
                minutes==time.minutes&&
                seconds==time.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }
}
