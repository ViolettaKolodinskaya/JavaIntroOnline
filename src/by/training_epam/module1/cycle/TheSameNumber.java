package by.training_epam.module1.cycle;

//8.Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class TheSameNumber {
    public static void main(String [] args){
        int a=234566;
        int b=367500;
        String s=Integer.toString(a);
        String d=Integer.toString(b);
        int [] arr= new int[s.length()];
        for(int i = s.length() - 1; i >= 0; i--) {
            arr[i] = a % 10;
            a /= 10;
        }
        int [] arr2= new int[d.length()];
        for(int i = d.length() - 1; i >= 0; i--) {
            arr2[i] = b % 10;
            b /= 10;
        }

        for(int j=0; j<arr.length; j++){
            for(int k=0; k<arr2.length; k++){
                if(arr[j]==arr2[k]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
