package cookies;

public class CookieOrder {
    private String variety;
    private Integer numBoxes;
    private Integer orderId;

    public CookieOrder(String variety, Integer numBoxes, Integer orderId) {
        this.variety = variety;
        this.numBoxes = numBoxes;
        this.orderId = orderId;
    }

    public String getVariety() {
        return variety;
    }

    public Integer getNumBoxes() {
        return numBoxes;
    }

    public Integer getOrderId() {
        return orderId;
    }


}
