package by.training_epam.module2.one_dimensional_array;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        double[] ar = {0.2, 0.1, 2.0, 3.0, 0.8, 4.0};
        System.out.print(sumOfPrimeNum(ar));

    }

    public static double sumOfPrimeNum(double[] ar) {
        double sum = 0;
        for (int i = 0; i < ar.length; i++) {
            if (primeOrNot(i+2)) {
                sum = sum + ar[i];
            }

        }
       return sum;
        }

    public static boolean primeOrNot(int i) {
        boolean isPrime = true;
        for (int j = 2; j < i-1; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}