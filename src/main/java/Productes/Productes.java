package Productes;

public abstract class Productes {

  private double preu;

  public Productes(double preu) {
    this.preu = preu;
  }

  public abstract String afegir();
  public abstract String retirar();
  public abstract String printar();
}
