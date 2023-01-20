package extraTasks.onlineShopV1;

/**
 * Author: Home PC
 * Date: 18/01/2023
 * Time: 18:13
 */
public class Product {
    private String productType;
    private String productName;
    private Double productPrice;
    private Integer AmountOfProduct;
    private String measureOfProduct;

    public Product() {
    }
    public Product(String productType, String productName, Double productPrice, Integer amountOfProduct, String measureOfProduct) {
        this.productType = productType;
        this.productName = productName;
        this.productPrice = productPrice;
        AmountOfProduct = amountOfProduct;
        this.measureOfProduct = measureOfProduct;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getAmountOfProduct() {
        return AmountOfProduct;
    }

    public void setAmountOfProduct(Integer amountOfProduct) {
        AmountOfProduct = amountOfProduct;
    }

    public String getMeasureOfProduct() {
        return measureOfProduct;
    }

    public void setMeasureOfProduct(String measureOfProduct) {
        this.measureOfProduct = measureOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productType='" + productType + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", AmountOfProduct=" + AmountOfProduct +
                ", measureOfProduct='" + measureOfProduct + '\'' +
                '}';
    }
}