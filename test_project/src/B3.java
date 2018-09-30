import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class B3 {

    Random r = new Random();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n;
    int[][] matrix;
    int[][] matrixConnectivity;//матрица связности
    int point = 2147483647;//максимальное число для типа int понадобится для выставления меток

    public B3 () throws IOException {

        System.out.println("Введите чило N: ");
        n = Integer.parseInt(reader.readLine());
        matrix = new int[n][n];
        matrixConnectivity = new int[n][n];
        fillMatrixRandom();
        printMatrix();
        deikstra();
    }//constructor

    public void fillMatrixRandom(){//заполняем матрицу рандомными числами, а а матрицу связности первоначальными метками

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(100); matrixConnectivity[i][j] = point;
            }
        }
            matrixConnectivity[0][0] = 0;//на начальную точку ставим метку = 0
    }//заполнение матрицы рандомными числами

    public void printMatrix(){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[ " + matrix[i][j] + " ] ");
                            }
            System.out.println();
        }

    }//печать матрицы


    public void deikstra(){//сделаем что то типа вариации алгоритма Дейкстры

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 ; j++) {//проходим по всем элементам, устнавливаем каждому элементу метку равную наименьшему растоянию от предидущего элемента

        int right = matrix[i][j+1] + matrixConnectivity[i][j];
        int down = matrix[i+1][j] + matrixConnectivity[i][j];

        if (right < matrixConnectivity[i][j+1]){matrixConnectivity[i][j+1] = right;}
        if (down < matrixConnectivity[i+1][j]){matrixConnectivity[i+1][j] = down;}

            }
        }


        matrixConnectivity[n-1][n-1] = Math.min(matrixConnectivity[n-2][n-1],matrixConnectivity[n-1][n-2]);
        matrixConnectivity[n-1][n-1] = matrixConnectivity[n-1][n-1] + matrix[n-1][n-1];


        ///
     //   System.out.println();
    //    for (int i = 0; i < n; i++) {
     //       for (int j = 0; j < n; j++) {
     //           System.out.print( "[ " + matrixConnectivity[i][j] + " ] ");
      //      }
     //       System.out.println();}


        ///


        //кратчайший пть равен метке конечного элемента
        //идем назад вычитаюя из метки растояние до нее, если получается число равное метке элемента, бинго! мы идем куда надо
        int x2 =0,y2 =0;
        int x = n-1;
        int y = n-1;
        while (x!=0 && y!=0){
            int tmp = matrixConnectivity[x][y] - matrix[x][y];
            if (matrixConnectivity[x][y-1] == tmp){matrix[x][y] = 100+matrix[x][y];  y = y-1; x2=x;y2=y;}//left
            if (matrixConnectivity[x-1][y] == tmp){matrix[x][y] = 100+matrix[x][y]; x = x-1;  x2=x;y2=y; }//up
       }//while

        matrix[x2][y2] = matrix[x2][y2] +100;
        //
        if (x2 == 0 && y2!=0){while (y2!=0){matrix[x2][y2] = matrix[x2][y2] + 100;y2--;}} //если дорожка уперлась вверх - идем влево до начала
        if (y2 == 0 && x2!=0){while (x2!=0){matrix[x2][y2] = matrix[x2][y2] + 100;x2--;}}//если дорожка уперлась влево - идем вверх до начала

        //
     //   System.out.println();
    //    for (int i = 0; i < n; i++) {
     //       for (int j = 0; j < n; j++) {
      //          System.out.print(matrix[i][j]+" ");
      //      }
      //      System.out.println();
     //   }
        System.out.println();

        System.out.println(); String[][] s = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {

                if (matrix[i][j]>99){
                    s[i][j]= " [ *  ] ";
                }else {
                    s[i][j]= " [ " + matrix[i][j] + " ] ";
                }
            }

        }

        s[0][0] = " [ A  ] "; s[n-1][n-1] = "[ B ] ";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }

    }//поиск кратчайшего пути

}
