import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A4 {
    int n;//длина массива
    int[] array;//массив
    int k;//число К
    int count;//cчетчик пар числе удовл-х условиям

    public A4() throws IOException {
        System.out.println("Введите длину массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());//читаем строку и преобразуем в число
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива");
            array[i] = Integer.parseInt(reader.readLine());
        }//заполняем массив

    System.out.println("Введите число К: ");
    k = Integer.parseInt(reader.readLine());//вводим число К
    System.out.println("Массив: " + Arrays.toString(array) + " число К = " + k);//и показываем массив

        //начинаем перебирать пары
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (((array[i]+array[j]) % k) == 0){count++;}
            }
        }
        System.out.println("Кол-во пар = " + count);
    }//constructor


}
