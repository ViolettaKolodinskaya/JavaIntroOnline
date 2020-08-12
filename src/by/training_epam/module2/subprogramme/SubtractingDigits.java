package by.training_epam.module2.subprogramme;

//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.


public class SubtractingDigits {
    public static void main(String[] args) {
        int num=34;
        System.out.println(countOfSubtractions(num));

    }

    private static int countOfSubtractions(int num){
        int remainder=num;
        int count=0;
        while(remainder>0){
            remainder=remainder-sum(getArray(remainder));
            count++;
            if(remainder<=0)
                break;
        }
        return count;
    }


private static int sum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
}


    private static int[] getArray(int num) {
        String s = Integer.toString(num);
        int[] result = new int[s.length()];
        for (int i =0; i <result.length; i++) {
                result[i] = num % 10;
                num /= 10;
            }

        return result;
    }

}
