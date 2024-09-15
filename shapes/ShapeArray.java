package shapes;

public class ShapeArray {
  Shape[] shapes = {
    new Sphere(2),
    new Cylinder(2, 5),
    new Cone(2, 5)
  };

  /**
   * Override the toString method to print the volume
   * and surface area of each shape in the shapes array.
   */
  @Override
  public String toString() {
    String shapeString = "";

    for (Shape shape : this.shapes) {
      shapeString += shape.toString();
    }

    return shapeString;
  }
}
