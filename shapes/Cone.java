package shapes;

public class Cone extends Shape {
  double radius;
  double height;

  public Cone(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  /**
   * Implement the surface_area method from the abstract Shape class to
   * calculate the surface area of a cone.
   */
  @Override
  public double surface_area() {
    return (Math.PI * this.radius *
      (this.radius + Math.sqrt(
        Math.pow(this.height, 2) +
        Math.pow(this.radius, 2))));
  }

  /**
   * Implement the volume method from the abstract Shape class to
   * calculate the volume of a cone.
   */
  @Override
  public double volume() {
    return Math.PI * Math.pow(this.radius, 2) * (this.height / 3);
  }

  /**
   * Override the toString method to print the
   * the volume and surface area of the cone.
   */
  @Override
  public String toString() {
    double surfaceArea = this.surface_area();
    double volume = this.volume();

    String output = String
      .format("\nCone\n Surface area: %.2f\n Volume: %.2f", surfaceArea, volume);
    System.out.println(output);

    return output;
  }
}
