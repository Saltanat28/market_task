package classes;

import enums.Product;
import enums.Region;
import java.util.List;

public class Market {
    private String name;
    private long id;
    private String address;
    private Region region;
    private List<Product> products;

    public Market(String name, long id, String address, Region region, List <Product> products) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.region = region;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Market- " +
                "name='" + name + "\n" +
                "id=" + id +
                "address: " + address + "\n" +
                "region: " + region +
                "products: " + products ;
    }
}
