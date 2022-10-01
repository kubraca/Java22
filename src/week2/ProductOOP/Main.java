package week2.ProductOOP;

public class Main {
    public static void main(String[] args){
        Product product=new Product();
        product.name="Laptop";
        product.id=123;
        product.description="Lenovo laptop IDEPADS145";
        product.price=7900;

        ProductManager productManager=new ProductManager();
        productManager.add(product);

    }

}
