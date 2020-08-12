package by.training_epam.module1.branching;

// 3.Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class StraightLine {
    public static void main (String [] args){

        line(0,1,2,0,1,2);
    }


    public static void line(int x1, int x2, int x3, int y1, int y2, int y3) {

        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.print("Точки расположены на одной прямой");
        }
        else{
            System.out.print("Точки не расположены на одной прямой");
        }
    }
}
