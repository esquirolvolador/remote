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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }



    @Override
    public String toString() {
        return "Decoración: Stock ID: " + super.getId() + ", material: " + this.material + ", precio:" +
                " " + this.getPrize() + " €";
    }
}
