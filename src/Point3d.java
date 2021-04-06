public class Point3d extends Point2d {
    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;

    }

    //Конструктор по умолчанию
    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    //Возвращение координаты z
    public double getZ() {
        return zCoord;
    }

    //Установка значений координаты z
    public void setZ(double val) {
        zCoord = val;
    }

    //сравнивает координаты двух точек
    public boolean Check(Point3d point2) {
        if (this.getX() == point2.getX() && this.getY() == point2.getY() && this.getZ() == point2.getZ()){
            return true;}
        else
            return false;
    }

    //считает растояние между двумя точками
    public double distanceTo(Point3d point){
        if(this.Check(point)) return 0;
        return Math.pow((Math.pow((this.getX() - point.getX()),2.0)
                + Math.pow((this.getY() - point.getY()),2.0) + Math.pow((this.getZ() - point.getZ()),2.0)), 0.5);
    }

    //считает площадь треугольника по трем точкам
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3){
        double a, b, c, p;
        a = p1.distanceTo(p2);
        b = p2.distanceTo(p3);
        c = p1.distanceTo(p3);
        p = (a+b+c)/2;
        return Math.pow((p*(p-a)*(p-b)*(p-c)),0.5);

    }
}

