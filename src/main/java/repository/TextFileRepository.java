package repository;

import model.FlowerShop;
import model.Ticket;

import java.io.*;

public class TextFileRepository implements Repository {
    @Override
    public void saveShop(FlowerShop shop) {

        try {

            FileOutputStream fileOutputStream
                    = new FileOutputStream("yourfile.txt");
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(shop);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void saveTicket(Ticket ticket) {

    }

    public FlowerShop loadShop() throws ClassNotFoundException, IOException {
        FileInputStream fileInputStream
                = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        FlowerShop shop = (FlowerShop) objectInputStream.readObject();
        objectInputStream.close();
        return shop;
    }
}
