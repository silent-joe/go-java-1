package ua.goit.shramko.serializator.basicobjects;

public class Circle implements Shape {

  private int radius;
  private Point center;
  
  public Point getCenter() {
    return center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  
  public Circle() {
    super();
  }
  
  public Circle(int radius, Point center) {
    super();
    this.radius = radius;
    this.center = center;
  }

}
