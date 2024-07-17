package lk.ijse;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Product product = new Product("Laptop", 1500.0);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("product.ser"))) {
            out.writeObject(product);
            System.out.println("Product has been serialized: " + product);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("product.ser"))) {
            Product deserializedProduct = (Product) in.readObject();
            System.out.println("Product has been deserialized: " + deserializedProduct);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
