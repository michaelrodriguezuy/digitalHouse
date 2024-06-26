package digitalHouse.checkout.model;

import java.util.List;

public class Checkout {

    private String id;
    private String url;
    private String totalAmount;
    private List<String> availableMethods;

    public Checkout(String id, String url, String totalAmount, 
    List<String> availableMethods) {
        this.id = id;
        this.url = url;
        this.totalAmount = totalAmount;
        this.availableMethods = availableMethods;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public List<String> getAvailableMethods() {
        return availableMethods;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setAvailableMethods(List<String> availableMethods) {
        this.availableMethods = availableMethods;
    }
}
