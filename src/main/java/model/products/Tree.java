package model.products;

public class Tree extends Product {

  private double height;

  public Tree(double prize, double height) {
    super(prize);
    this.height = height;

  }
  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "Arbol: Stock ID: " + super.getId()+ ", altura: " + this.height + ", precio: " + this.getPrize() + " €";
  }
}
