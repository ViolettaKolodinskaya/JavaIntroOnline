package by.training_epam.module1.branching;

//1.Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class Triangle {

    public static void main(String [] args){

        corner(45,90);
    }

    public static void corner(int x, int y){

     if(x>90||x==0||y==0||y>90||x+y>=180){
         System.out.print("Треугольник не существует");
     }

     else{
         String exist="Треугольник существует";
         if(x==90||y==90||x+y==90){
             System.out.print(exist + " и он прямоугольный");
         }
         else{
             System.out.print(exist);
         }
     }
    }
}
