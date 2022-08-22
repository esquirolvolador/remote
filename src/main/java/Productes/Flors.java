package Productes;

public class Flors extends Productes {

  public Flors(double preu, String color) {
    super(preu);
    this.color = color;
  }

  private String color;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
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
