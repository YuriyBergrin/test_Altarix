import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите номер задания от A1 до С1: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();//вводим номер задания и создаем обьект класса для решения данной задачи
        switch (number){
            case "A1" : A1 a1 = new A1(); break;
            case "A2" : A2 a2 = new A2(); break;
            case "A3" : A3 a3 = new A3(); break;
            case "A4" : A4 a4 = new A4(); break;
            case "A5" : A5 a5 = new A5(); break;
            case "B1" : B1 b1 = new B1(); break;
            case "B2" : B2 b2 = new B2(); break;
            case "B3" : B3 b3 = new B3(); break;
            case "C1" : С1 с1 = new С1(); break;

        }

    }
}
