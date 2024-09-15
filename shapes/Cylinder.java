package shapes;

public class Cylinder extends Shape {
  double radius;
  double height;

  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }
  
  /**
   * Implement the surface_area method from the abstract Shape class to
   * calculate the surface area of a cylinder.
   */
  @Override
  public double surface_area() {
    return (
      2.0 * Math.PI * this.radius * this.height +
      2.0 * Math.PI * Math.pow(this.radius, 2));
  }

  /**
   * Implement the volume method from the abstract Shape class to
   * calculate the volume of a cylinder.
   */
  @Override
  public double volume() {
    return Math.PI * Math.pow(this.radius, 2) * this.height;
  }

  /**
   * Override the toString method to print the
   * the volume and surface area of the cylinder.
   */
  @Override
  public String toString() {
    double surfaceArea = this.surface_area();
    double volume = this.volume();

    String output = String
      .format("\nCylinder\n Surface area: %.2f\n Volume: %.2f", surfaceArea, volume);
    System.out.println(output);

    return output;
  }
}
