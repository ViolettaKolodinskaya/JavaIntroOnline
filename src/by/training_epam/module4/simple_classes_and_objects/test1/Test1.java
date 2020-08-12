package module4;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Test1 {
    private int a;
    private int b;

    public static void main(String [] args){
print(3,5);
sum(3,5);
max(3,5);
    }

    public static void print(int a, int b){
        System.out.print(a + " " + b);
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }

    public static int sum(int a, int b){
        int c= a+b;
        return c;
    }

    public static int max(int a, int b){
        int max= Math.max(a,b);
        return max;
    }
}
