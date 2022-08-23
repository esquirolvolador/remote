package model.products;

public class Tree extends Product {
  private double height;

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Tree(double prize, double height) {
    super(prize);
    this.height = height;
  }
}
