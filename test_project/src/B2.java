import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class B2 {
    int n;
    int [] sourse;
    int [][] matrix;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Random r = new Random();

    B2() throws IOException {

        System.out.println("Введите число N: ");
        n = Integer.parseInt(reader.readLine());
        matrix = new int[n][n];
        sourse = new int[n*n];

        for (int i = 0; i < sourse.length; i++) {
            sourse[i] = r.nextInt(10);
        }//генерируем массив

        System.out.println("Массив до сортировки = " + Arrays.toString(sourse));

        Arrays.sort(sourse);//сортируем массив

        System.out.println("Массив после сортировки = " + Arrays.toString(sourse));

        fill();//заполним матрицу элементами массива

        System.out.println("Выведем массив змейкой");
        snakePrint();

    }//constructor

   public void fill(){

       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
               matrix[i][j] = sourse[i*n + j];
           }
       }

   }

   public void snakePrint(){

       for (int i = 0; i < n; i++) {
           if (i % 2 == 0){//если строка нечетная то выводим в нормально порядке и не забываем, что в java нумерация с 0

               for (int j = 0; j < n; j++) {
                   System.out.print(matrix[i][j]);
               } System.out.println();

           }


           if (i % 2 != 0) {//если строка четная - выводим в обратном порядке

               for (int j = n - 1; j >= 0 ; j--) {
                   System.out.print(matrix[i][j]);
               }System.out.println();

           }

       }

   }//snake

}
