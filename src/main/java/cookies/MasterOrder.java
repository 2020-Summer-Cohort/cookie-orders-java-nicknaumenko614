package cookies;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

    private ArrayList<CookieOrder> orders = new ArrayList<CookieOrder>();

    public MasterOrder() {

    }


    public int getTotalBoxes() {
        Integer totalNumberOfBoxes = 0;
        for (CookieOrder order : orders) {
            Integer numberOfBoxesOfVariety = order.getNumBoxes();
            totalNumberOfBoxes = totalNumberOfBoxes + numberOfBoxesOfVariety;
        }
        return totalNumberOfBoxes;

    }

    public void addOrder(CookieOrder order) {

        orders.add(order);
    }

    public void removeVariety(String varietyToRemove) {
        ArrayList<CookieOrder> ordersToBeRemoved = new ArrayList<>();
        for (CookieOrder order : orders) {
            String variety = order.getVariety();
            if (varietyToRemove.equalsIgnoreCase(variety)) {
                ordersToBeRemoved.add(order);
            }

        }
        orders.removeAll(ordersToBeRemoved);

    }

    public int getNumberOfBoxesForGivenVariety(String varietyToCount) {
        Integer numberOfBoxesForGivenVariety = 0;
        for (CookieOrder order : orders) {
            String variety = order.getVariety();
            if (varietyToCount.equalsIgnoreCase(variety)) {
                Integer numberOfBoxesOfVarietyInOrder = order.getNumBoxes();
                numberOfBoxesForGivenVariety = numberOfBoxesForGivenVariety + numberOfBoxesOfVarietyInOrder;
            }

        }


        return numberOfBoxesForGivenVariety;
    }

    public void showOrder() {
        for (CookieOrder order : orders) {
            System.out.println("Your order number " + order.getOrderId() + " contains " + order.getNumBoxes() + " boxes of " + order.getVariety() + " cookies");
        }
    }


}
