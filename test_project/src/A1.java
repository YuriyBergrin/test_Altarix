import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1 {
    int xA,xB,xC,xD;
    int yA,yB,yC,yD; //координаты точек
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    A1() throws IOException {

    fillPoints();//заполняем коо-ты точек

    //точка будет принадлежать треугольнику, если будет принадлежать одновременно трем полуплоскостям,
    // пересечение которых и есть треугольник.

    int a = (xA - xD) * (yB - yA) - (xB - xA) * (yA - yD);
    int b = (xB - xD) * (yC - yB) - (xC - xB) * (yB - yD);
    int c = (xC - xD) * (yA - yC) - (xA - xC) * (yC - yD);

        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0))
        {
            System.out.println("IN");
        }
        else
        {
            System.out.println("OUT");
        }



    }//constructor

    public void fillPoints() throws IOException {
        System.out.println("Введите координату xA: ");
        xA = Integer.parseInt(reader.readLine());
        System.out.println("Введите координату yA: ");
        yA = Integer.parseInt(reader.readLine());//вводим коо-ты точки А

        System.out.println("Введите координату xB: ");
        xB = Integer.parseInt(reader.readLine());
        System.out.println("Введите координату yB: ");
        yB = Integer.parseInt(reader.readLine());//вводим коо-ты точки B

        System.out.println("Введите координату xC: ");
        xC = Integer.parseInt(reader.readLine());
        System.out.println("Введите координату yC: ");
        yC = Integer.parseInt(reader.readLine());//вводим коо-ты точки C

        System.out.println("Введите координату xD: ");
        xD = Integer.parseInt(reader.readLine());
        System.out.println("Введите координату yD: ");
        yD = Integer.parseInt(reader.readLine());//вводим коо-ты точки D
         }
}
