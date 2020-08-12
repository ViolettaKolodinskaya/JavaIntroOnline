package by.training_epam.module2.one_dimensional_array;

 //3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 //положительных и нулевых элементов.

public class CountOfElements {
    public static void main(String [] args){
        int n=4;
        int [] array= new int [n];
        array[0]=-1;
        array[1]=4;
        array[2]=0;
        array[3]=24;
        count(array);
    }

    public static void count(int [] array){
       int countNull=0;
       int countPlus=0;
       int countMinus=0;
       for(int i=0; i<array.length; i++){
           if(array[i]==0){
               countNull++;
           }
           else if(array[i]<0){
               countMinus++;
           }
           else if(array[i]>0){
               countPlus++;
           }
       }
       System.out.print("Отрицательных элементов: " + countMinus + "\nПоложительных элементов: " + countPlus + "\nНулевых элементов: " + countNull);
    }
}
