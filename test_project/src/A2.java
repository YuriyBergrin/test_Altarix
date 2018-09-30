import java.util.Random;

public class A2 {

    int [][] matrix = new int[3][3];
    int sumFirst;
    int sumSecond;
    Random r = new Random();

    public A2() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = r.nextInt(10);
            }
        }//заполняем массив рандомными числами от 0 до 9

        System.out.println("Дана матрица:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }//печатаем  рандомную матрицу матрицу

        System.out.println();//пустая строка

        for (int i = 0; i < 3; i++) {
            sumFirst += matrix[i][i];
            sumSecond += matrix[i][3 - i - 1];
        }

        System.out.println("Разницa между суммами диагоналей матрицы = " + Math.abs(sumFirst - sumSecond) );

    }// constructor

}
