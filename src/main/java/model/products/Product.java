package model.products;

public abstract class Product {
  private double prize;

  public Product(double prize) {
    this.prize = prize;
  }

  public double getPrize() {
    return prize;
  }
}
