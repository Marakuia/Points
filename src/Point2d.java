public class Point2d {
    private double xCoord;
    private double yCoord;


    //Конструктор инициализации
    public Point2d (double x, double y){
        xCoord = x;
        yCoord = y;

    }

    //Конструктор по умолчанию
    public Point2d(){
        this(0,0);
    }
    //Возвращение координаты х
    public double getX(){
        return xCoord;
    }
    //Возвращение координаты у
    public double getY(){
        return yCoord;
    }

    //Установка значений координаты X
    public void setX(double val){
        xCoord = val;
    }
    //Установка значений координаты Y
    public void setY(double val){
        yCoord = val;
    }


}
