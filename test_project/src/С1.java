import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class С1 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    double a = 0;
    double b = 0;
    boolean flag = true;
    String input;
    String operation;


    public С1() throws IOException {
        Calculator calculator = new Calculator();
        System.out.println("КАЛЬКУЛЯТОР");
        System.out.println("Введите число, затем одну из операций: ");
        System.out.println("+ - сложение");
        System.out.println("- - вычитание");
        System.out.println("* - умножение");
        System.out.println("/ - деление");
        System.out.println("= - равно");
        System.out.println("Введите число, затем одну из операций: ");


        input = reader.readLine();
        while(!isDoble(input)){
            System.out.println("Введите число, а не символ!!!"); input = reader.readLine();
        }//ввод и проверка первого числа

        a  = Double.parseDouble(input); //записали первое число




        while (flag){


            input = reader.readLine();
            while (!(isOperation(input))){
                System.out.println("Введите знак операции!!!"); input = reader.readLine();
            }//проверка вввода знака операции

            operation = input;//записали какая будет операция
            if (input.equals("=")){break;}



            input = reader.readLine();
            while(!isDoble(input)){
                System.out.println("Введите число, а не символ!!!"); input = reader.readLine();
            }//ввод и проверка следующего числа

            b  = Double.parseDouble(input); //записали второе число

            switch (operation){
                case "=" :   break;
                case "+" :  a = calculator.addition(a,b); break;
                case "-" :  a = calculator.subtraction(a,b); break;
                case "*" :  a = calculator.multiplication(a,b); break;
                case "/" :  a = calculator.division(a,b); break;
            }



             } System.out.println("РЕЗУЛЬТАТ = " + a);

    }

    public boolean isDoble(String input){
        try {
            double num = Double.parseDouble(input); return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public boolean isOperation(String input){
        if (input.equals("+")){return  true;}
        if (input.equals("-")){return  true;}
        if (input.equals("*")){return  true;}
        if (input.equals("/")){return  true;}
        if (input.equals("=")){return  true;}
    else return false;}

}
