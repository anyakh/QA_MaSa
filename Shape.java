public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimetr();
    public void printing(double x, double y){
         System.out.println("Perimeter is: " + x + " Area of the is: " + y);
    }
}
class Circle extends Shape{
    int radius;
    public Circle(int r){
        this.radius = r;
    }
    public double calculateArea(){
        double area = Math.PI*radius*radius;
        return area;
    }
    public double calculatePerimetr(){
        double perimetr = 2* Math.PI*radius;
        return perimetr;
    }

}
class Rectangle extends Shape{
    int side1;
    int side2;
    public Rectangle(int s1, int s2){
        this.side1 = s1;
        this.side2 = s2;
    }
    public double calculateArea(){
        int area = side1 * side2;
        return area;
    }
    public double calculatePerimetr(){
        double perimetr = 2*side1+ 2*side2;
        return perimetr;
    }
    
}

