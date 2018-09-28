import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите номер задания от A1 до С1: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        switch (number){
            case "A2" : A2 a2 = new A2(); break;
        }

    }
}
