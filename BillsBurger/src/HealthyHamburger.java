public class HealthyHamburger extends Hamburger {

    private Additions addition5;
    private Additions addition6;

    public HealthyHamburger(String meat, double basicPrice) {
        this("Healthy Burger", meat, basicPrice);
    }

    public HealthyHamburger(String name, String meat, double basicPrice) {
        super(name,"brown rye", meat, basicPrice);
    }

    public void addAddition5(Additions addition5) {
        this.addition5 = addition5;
    }

    public void addAddition6(Additions addition6) {
        this.addition6 = addition6;
    }

    @Override
    public String getDetails() {
        String details = super.getDetails();
        if (this.addition5 != null) {
            details += "plus " + this.addition5.getName()
                    + " for " + this.addition5.getPrice() + " €.\n";
        }
        if (this.addition6 != null) {
            details += "plus " + this.addition6.getName()
                    + " for " + this.addition6.getPrice() + " €.\n";
        }
        return details;
    }

    @Override
    public double getTotalPrice() {
        double basicPrice = super.getTotalPrice();
        double additionsPrice = 0;
        additionsPrice += (this.addition5 != null) ? this.addition5.getPrice() : 0;
        additionsPrice += (this.addition6 != null) ? this.addition6.getPrice() : 0;
        return basicPrice + additionsPrice;
    }
}
