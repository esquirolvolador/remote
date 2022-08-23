package model.products;

public class Tree extends Product {
  private double height;
  public Tree(double prize, double height) {
    super(prize);
    this.height = height;
  }
}
