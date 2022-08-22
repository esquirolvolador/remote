package model.products;

public class Decoration extends Product {
    public enum Material {
        WOOD,
        PLASTIC
    }

    private Material material;

    public Decoration(double prize, Material material) {
        super(prize);
        this.material = material;
    }
}
