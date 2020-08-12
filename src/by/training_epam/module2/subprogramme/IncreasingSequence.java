package by.training_epam.module2.subprogramme;

//15.Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class IncreasingSequence {
    public static void main(String[] args) {
        for(int i=100; i<1000; i++){
            if(isIncreas(i))
            System.out.print(i+ " ");
        }
    }

    public static boolean isIncreas(int i){
        boolean increasing=false;
        String s=Integer.toString(i);
            int a=0;
            if(s.charAt(a)+2==s.charAt(a+1)+1&&s.charAt(a+1)+1==s.charAt(a+2)){
              increasing=true;
            }
return increasing;
    }

}