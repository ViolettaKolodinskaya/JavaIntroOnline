package by.training_epam.module2.sort;

//8.Даны дроби. Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.


public class Fractions {
    public static void main(String[] args) {
        int[] numerator = {4, 5, 6};
        int[] denominator = {6, 7, 8};
        printFraction(numerator, denominator);
        printSortedFractions(numerator, denominator);
    }



    public static void printFraction(int[] numerator, int[] denominator) {
        for (int i = 0; i < numerator.length; i++) {
            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
        System.out.println();
    }

    private static void printFraction (int[] newNumerator, int denominator){
        for (int i = 0; i < newNumerator.length; i++) {
            System.out.print(newNumerator[i] + "/" + denominator + " ");
        }
        System.out.println();
    }




    public static int commonDenominator(int[] denominator) {
        int num = 1;
        for (int i = 0; i < denominator.length; i++) {
            num = num * denominator[i];
        }
        return num;
    }



    public static int number(int[] denominator) {
        int number = 0;
        for (int i = 0; i < denominator.length; i++) {
            number = commonDenominator(denominator) / denominator[i];
        }
        return number;
    }


    public static void printSortedFractions(int[] numerator, int[] denominator) {
        int[] newNumerator = new int[numerator.length];
        for (int i = 0; i < numerator.length; i++) {
            newNumerator[i]=numerator[i]*number(denominator);
        }

        printFraction (sortedNumerator(newNumerator), commonDenominator(denominator));
    }


    public static int[] sortedNumerator(int[] newNumerator) {
        for (int i = 0; i < newNumerator.length; i++) {
            int min = newNumerator[i];
            int minInd = i;
            for (int j = i + 1; j < newNumerator.length; j++) {
                if (newNumerator[j] < min) {
                    min = newNumerator[j];
                    minInd = j;
                }
            }
            if (i != minInd) {
                int tmp = newNumerator[i];
                newNumerator[i] = newNumerator[minInd];
                newNumerator[minInd] = tmp;

            }
        }
        return newNumerator;
    }
}