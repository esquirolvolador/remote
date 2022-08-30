package repository;

import model.FlowerShop;
import model.products.Product;
import model.Ticket;

import java.io.IOException;

public interface Repository {


    void saveShop(FlowerShop shop);

    void saveTicket(Ticket ticket);

    FlowerShop loadShop() throws ClassNotFoundException, IOException;
}
