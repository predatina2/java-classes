public class HealthyHamburger extends Hamburger {


    public HealthyHamburger(String meat, double basicPrice) {
        this("Healthy Burger", meat, basicPrice);
    }

    public HealthyHamburger(String name, String meat, double basicPrice) {
        super(name,"brown rye", meat, basicPrice, 6);
    }
}
