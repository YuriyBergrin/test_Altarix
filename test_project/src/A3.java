import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3 {
    public A3() throws IOException {

        System.out.printf("Введите число ступенек: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());//читаем строку и преобразуем в число

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }

            System.out.println();}

    }//constructor
}
