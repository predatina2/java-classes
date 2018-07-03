public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(String name, String breadRollType, String meat, double basicPrice) {
        super(name, breadRollType, meat, basicPrice);
        super.addAddition1(new Chips());
        super.addAddition2(new Drinks());
    }

    public DeluxeHamburger(String breadRollType, String meat, double basicPrice) {
        this("Deluxe Burger", breadRollType, meat, basicPrice);
    }

    @Override
    public void addAddition1(Additions addition1) {
        System.out.println("no additions allowed");
    }

    @Override
    public void addAddition2(Additions addition2) {
        System.out.println("no additions allowed");
    }

    @Override
    public void addAddition3(Additions addition3) {
        System.out.println("no additions allowed");
    }

    @Override
    public void addAddition4(Additions addition4) {
        System.out.println("no additions allowed");
    }

    @Override
    public double getTotalPrice() {
        return super.getBasicPrice(); // additions cost no extra
    }
}
