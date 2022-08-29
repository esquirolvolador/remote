package tests;

import controller.FlowerShopController;
import model.products.Decoration;
import model.products.Flower;
import model.products.Tree;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import repository.Repository;
import repository.TextFileRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@FixMethodOrder(MethodSorters.DEFAULT)
public class controllerTest {

    //Popular datos
    static Repository repository = new TextFileRepository();
    static FlowerShopController flowerShopController = new FlowerShopController(repository);

    @Before
    public void popular() {
        flowerShopController.createFlowerShop("Floristeria");
        Decoration dec = new Decoration(1, Decoration.Material.PLASTIC);
        Flower flo = new Flower(1, "blue");
        Tree tree = new Tree(1, 100);
        for (int i = 0; i < 5; i++) {
            flowerShopController.getFlowerShop().addProduct(tree);
            flowerShopController.getFlowerShop().addProduct(flo);
            flowerShopController.getFlowerShop().addProduct(dec);
        }
    }

    @Test
//    FlowerShopNotNull() {
    void Test1() {
        popular();
        assertNotNull(flowerShopController.getFlowerShop());
    }

    @Test
        //testSingletonFlowerShop() {
    void Test2() {
        flowerShopController.createFlowerShop("Cerveceria");
        assertEquals("Floristeria", flowerShopController.getFlowerShop().getName());
    }

    @Test
        //testNumberOfProductsAdded() {
    void Test3() {
        assertEquals(15, flowerShopController.getFlowerShop().getStock().getAllProductsStock().size());
    }

    @Test
        //testSumOfTotalStock() {
    void Test4() {
        assertEquals(15, flowerShopController.getFlowerShop().getStock().getTotalStockValue());
    }


}
