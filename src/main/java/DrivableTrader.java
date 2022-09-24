/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;
class DrivableTrader <T> extends Trader{

    public DrivableTrader(List inventory, List wishlist, int money) {
        super(inventory, wishlist, money);
    }
    public DrivableTrader(int money){
        super(money);


    }

    public void addToWishlist(Object object){
        if (object instanceof Drivable){
            this.getWishlist().add(object);
        }
    }
    @Override
    public int getSellingPrice(Object object){
        if (object instanceof Tradable && object instanceof Drivable){
            return ((Tradable) object).getPrice() + ((Drivable) object).getMaxSpeed();
        }
        return Tradable.MISSING_PRICE;
    }

}
