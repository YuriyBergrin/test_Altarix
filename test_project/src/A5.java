public class A5 {
   int m = 4;
   int n = 10;
   int k = 2;
   int f = 3;//размеры матриц
   int count;// счетчик совпадающих элементов в матрице
   boolean flag;//переменная для того, чтобы знать нашли ли мы совпадение (если нет то выводим FAIL)

    int [][] matrix = {{1,2,3,4,5,6,7,8,9,0},
                      {2,2,2,2,1,2,1,2,3,1},
                      {2,7,7,8,1,1,2,1,1,0},
                      {6,7,7,8,1,2,3,4,6,8}}; //матрица

   int[][] pattern = {{1,2,1},
                     {1,1,2}};//шаблон


    public A5() {

        for (int i = 0; i < m - k + 1; i++) {
            for (int j = 0; j < n - f + 1; j++) {
                if (matrix[i][j] == pattern[0][0]){ //находим эл-т равный первому в шаблоне
                    count = 0;//обнуляем счетчик совпадений
                    for (int l = 0; l < k; l++) {
                        for (int o = 0; o < f; o++) {//проверяем все остальные
                            if (matrix[i + l][j + o] == pattern[l][o]){count++;}
                        }//foro
                    }//forl

                    if (count == k * f){
                        flag = true;
                        System.out.println("Коородинаты 1го эл-та: ( " + i + " ; " + j + " )"); break;
                    }

                }//if
                }//forj
            }//fori

            if (!flag){
                System.out.println("FAIL");
            }
    }//constructor
}
