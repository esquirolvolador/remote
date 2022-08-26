package model.products;

public class Tree extends Product {

  private int id;
  private double height;

  public Tree(double prize, double height) {
    super(prize);
    this.height = height;
    this.id = getCurrentId();
  }
  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "Arbol: Stock ID: " + this.id + ", altura: " + this.height + ", precio: " + this.getPrize() + " €";
  }

}
