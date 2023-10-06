import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner dot = new Scanner(System.in);
            System.out.println("Введите координаты первой точки");
            double x1 = dot.nextInt();
            double y1 = dot.nextInt();
            double z1 = dot.nextInt();
            System.out.println("Введите координаты второй точки");
            double x2 = dot.nextInt();
            double y2 = dot.nextInt();
            double z2 = dot.nextInt();
            System.out.println("Введите координаты третьей точки");
            double x3 = dot.nextInt();
            double y3 = dot.nextInt();
            double z3 = dot.nextInt();
            dot.close();
            Point3d point1 = new Point3d(x1, y1, z1);
            Point3d point2 = new Point3d(x2, y2, z2);
            Point3d point3 = new Point3d(x3, y3, z3);


            //Подсчет площади треугольника
            if (point1.Check(point2) || point2.Check(point3) || point1.Check(point3))
                    System.out.println("Невозможно вычислить площадь, т.к. координаты точек совпадают");
            else
                System.out.println(point1.computeArea(point1,point2,point3));


    }
}
