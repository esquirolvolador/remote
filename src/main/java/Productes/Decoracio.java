package Productes;

public class Decoracio extends Productes {

  private String material;

  public Decoracio(double preu, String material) {
    super(preu);
    this.material = material;
  }

  @Override
  public String afegir() {
    return "";
  }

  @Override
  public String retirar() {
    return "";
  }

  @Override
  public String printar() {
    return "";
  }
}
