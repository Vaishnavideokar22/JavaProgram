abstract class Shape{
    double area;
    double length;
    double width;
    Shape(double length, double width){
      this.length = length;
      this.width = width;
      this.area = area;
      area = length*width;
      System.out.println("The Area OF Rectangle is: "+ this.area);
    }
}

class Perimeter extends Shape{
    double perimeter;
    double length;
    double width;

Perimeter(double length,double width){
    super(length,width);
    this.length = length;
    this.width = width;
    this.perimeter = 
  perimeter = 2*length*width;
  System.out.println("The Perimeter Of Rectangle is:" + this.perimeter);
}
}


public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        
        Perimeter p1 = new Perimeter(3,6);
    }
    
}
