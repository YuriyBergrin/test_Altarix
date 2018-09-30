import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1 {
    String s;//строка, которую вводит пользователь
    Stack<Character> stack = new Stack<>();//стек для последней открытой скобки
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public B1() throws IOException {
        System.out.println("Введите строку: ");
        s = reader.readLine();//читаем строку и записываем
        checker();//проверяем строку с помощью метода checker


    }//constructor

    public void checker() {
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '{':
                    stack.push('{');//пушим все открывающиеся скобки в стек
                    break;
                case ')':
                    if (!stack.empty() && !stack.pop().equals('(')) { //если стек непустой и
                                                                      // выдавленый из него символ скобка другово вида
                                                                      // - у нас ошибка
                        System.out.print("FAIL");
                        return;
                    }
                    break;
                case ']':
                    if (!stack.empty() && !stack.pop().equals('[')) {
                        System.out.print("FAIL");
                        return;
                    }
                    break;
                case '}':
                    if (!stack.empty() && !stack.pop().equals('(')) {
                        System.out.print("FAIL");
                        return;
                    }
                    break;

            }//switch
        }//fori
        if (stack.empty()) {
            System.out.print("SUCCESS");
        } else {
            System.out.print("FAIL");
        }
    }//checker
}//class

