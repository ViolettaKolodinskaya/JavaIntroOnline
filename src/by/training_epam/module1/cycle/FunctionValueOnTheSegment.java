package by.training_epam.module1.cycle;

//2. Вычислить значения функции на отрезке [а,b] c шагом h.

public class FunctionValueOnTheSegment {
    public static int y;
    public static void main(String [] args){
        int a=2, b=10;
        int h=2;

        for(int i=a; i<b; i=i+h){
            if(i<=2&&i!=0){
                 y=-i;
            }
           else if(i>2){
                 y=i;
            }
           else if(i==0){
               y=0;
            }
            System.out.println(y);
        }
    }
}
