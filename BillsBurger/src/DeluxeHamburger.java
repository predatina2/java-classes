public class DeluxeHamburger extends Hamburger {


    public DeluxeHamburger(String name, String breadRollType, String meat, double basicPrice) {
        super(name, breadRollType, meat, basicPrice, 2);
        super.addAddition(Addition.createChips());
        super.addAddition(Addition.createDrinks());
    }

    public DeluxeHamburger(String breadRollType, String meat, double basicPrice) {
        this("Deluxe Burger", breadRollType, meat, basicPrice);
    }


    @Override
    public double getTotalPrice() {
        return super.getBasicPrice(); // additions cost no extra
    }
}
