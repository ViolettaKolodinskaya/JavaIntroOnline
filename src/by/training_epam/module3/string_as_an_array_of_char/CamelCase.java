package by.training_epam.module3.string_as_an_array_of_char;

//1.Дан массив названий переменных в camel_Case. Преобразовать названия в snake_case.

import java.util.Arrays;

public class CamelCase {
    public static void main(String [] args){
        String [] arr={"snakeCase", "camelCase2", "arrayOfChar"};
        System.out.print(Arrays.toString(snakeCase(arr)));
    }

    public static String [] snakeCase( String [] arr){
        String [] snake= new String [arr.length];
        for(int i=0; i<arr.length; i++){
            char[] chars = arr[i].toCharArray();
            snake[i] = "";
            for (int j = 0; j < chars.length; j++) {
                if (Character.isUpperCase(chars[j]))
                    chars[j] = Character.toLowerCase(chars[j]);
                snake[i] = snake[i] + chars[j];
            }

        }
        return snake;
    }
}
