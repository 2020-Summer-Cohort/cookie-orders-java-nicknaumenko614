package cookies;

public class OrderApp {
    public static void main(String[] args) {

        MasterOrder cookieShoppingCart = new MasterOrder();
        CookieOrder order1 = new CookieOrder("Chocolate",3,1);
        CookieOrder order2 = new CookieOrder("Mint",2,2);
        CookieOrder order3 = new CookieOrder("Chocolate",1,3);
        CookieOrder order4 = new CookieOrder("Sugar",5,4);

        cookieShoppingCart.addOrder(order1);
        cookieShoppingCart.addOrder(order2);
        cookieShoppingCart.addOrder(order3);
        cookieShoppingCart.addOrder(order4);

        System.out.println("Total boxes purchased = "+cookieShoppingCart.getTotalBoxes());
        cookieShoppingCart.showOrder();


        Integer boxesToRemove = cookieShoppingCart.getNumberOfBoxesForGivenVariety("Chocolate");
        cookieShoppingCart.removeVariety("Chocolate");
        System.out.println("Removed " + boxesToRemove + " boxes of Chocolate cookies" );

        cookieShoppingCart.showOrder();

    }
}
