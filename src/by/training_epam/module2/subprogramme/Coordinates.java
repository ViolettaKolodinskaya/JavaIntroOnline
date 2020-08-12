package by.training_epam.module2.subprogramme;

//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import java.util.Arrays;

public class Coordinates {
    public static void main (String [] args){
        double[] x={1.0, 2.0, 0.0, -2.0};
        double[] y={1.0, 2.0, 0.0, -3.0};
        printPair(countDistance(x, y));


    }

    private static double[][] countDistance(double[] x, double [] y) {
        int maxIndex1=0;
        int maxIndex2=0;
        double maxDistance=0.0;
        double count=0.0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < y.length; j++) {
                count=count(x[i], y[i], x[j], y[j]);
                if(count > maxDistance){
                   maxIndex1=i;
                   maxIndex2=j;
                }

            }
        }

        double[][] pair={{x[maxIndex1],y[maxIndex1]},
                {x[maxIndex2],y[maxIndex2]}};

        return pair;
    }


    private static void printPair(double [][] pair){
        System.out.println("Самое большое расстояние между точками с координатами " + Arrays.deepToString(pair));
    }


    private static double count(double x, double y, double x2, double y2){
        return Math.abs(Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)));
    }
}
