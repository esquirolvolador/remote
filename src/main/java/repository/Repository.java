package repository;

import model.products.Product;
import model.Ticket;

public interface Repository {
    void saveProduct(Product product);
    void saveTicket(Ticket ticket);
}
