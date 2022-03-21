package javaHomeworkWeek7;

public class Wall {
    double width,height;

    public static void main(String[] args)
    {
        Wall wall = new Wall(5,4);
        System.out.println("area= " +wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= "    + wall.getArea());
    }
    public Wall()
    {

    }
    public Wall (double w , double h)
    {
        if (w<0)
            width = 0;
        else
            width = w;
        if(h<0)
            height = 0;
        else
            height = h;
    }
    public  double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public  double setWidth(double w1)
    {
        if (w1 < 0)
            width = 0;
        return width;
    }
    public double setHeight( double h1)
    {
        if (h1 < 0)
            height =0;
        return height;
    }
    public double getArea()
    {
        double area;
        area = width * height;
        return area;
    }


}
