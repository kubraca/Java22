package Week3_OopWithNLayered.entites;

public class ProductEntity {
    private int productId;
    private String productName;
    private double unitPrice;

    public ProductEntity() {

    }

    public ProductEntity(int id, String name, double unitPrice) {
        this.productId = id;
        this.productName = name;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}

