package by.training_epam.module1.cycle;

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Divider {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int m=scan.nextInt();
            int n=scan.nextInt();
            if(m>0&&n>0&&m<n){
                for(int j=m; j<n; j++){
                    for(int i=2; i<n; i++) {
                        if(j%i==0&&j!=i){
                            System.out.println(j + ": " + i);
                        }
                    }
                }
            }
        }
    }

