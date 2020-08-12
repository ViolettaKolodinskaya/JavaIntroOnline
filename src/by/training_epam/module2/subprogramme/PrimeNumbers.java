package by.training_epam.module2.subprogramme;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class PrimeNumbers {
    public static void main (String [] args){
        System.out.print(primeNumbers(9,4,6));

    }
    public static boolean primeNumbers(int a, int b, int c){
        int count=0;
      for(int i=2; i<a; i++){
          if(a%i==0&&b%i==0&&c%i==0){
              count+=1;
          }
      }
      if(count==0){
          return true;}
      else{
          return false;
      }
    }
}
