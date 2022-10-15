package Week3_OopWithNLayered.staticDemo;

public class Main {
    public static void main(String [] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price = 100;
        product.name="Keyboard";
        manager.add(product);
        DatabaseHelper.Crud.Delete();// inner class üzerinden cagırma
        DatabaseHelper.Connection.createConnection();
    }

}
