package by.training_epam.module2.multidimensional_array;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class SquareMatrix {
    public static void main(String [] args){
        int [][] arr={{1,2,3,4},{0,1,3,4},{9,2,1,4},{8,2,3,1}};
        printSquareMatrix(arr);
    }

    public static void printSquareMatrix(int [][] arr){
        for(int i=0; i<arr.length; i++){
                    System.out.println(arr[i][i]);
                }
            }
        }
