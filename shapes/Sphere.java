package shapes;

public class Sphere extends Shape {
  double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  /**
   * Implement the surface_area method from the abstract Shape class to
   * calculate the surface area of a sphere.
   */
  @Override
  public double surface_area() {
    return (Math.PI * Math.pow(this.radius, 2) * 4.0);
  }

  /**
   * Implement the volume method from the abstract Shape class to
   * calculate the volume of a sphere.
   */
  @Override
  public double volume() {
    return  (Math.PI * Math.pow(this.radius, 3)) * (4.0 / 3.0);
  }

  /**
   * Override the toString method to print the
   * the volume and surface area of the sphere.
   */
  @Override
  public String toString() {
    double surfaceArea = this.surface_area();
    double volume = this.volume();

    String output = String
      .format("\nSphere\n Surface area: %.2f\n Volume: %.2f", surfaceArea, volume);
    System.out.println(output);

    return output;
  }
}
