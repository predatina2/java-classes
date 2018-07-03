public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double basicPrice;

    private Additions addition1;
    private Additions addition2;
    private Additions addition3;
    private Additions addition4;

    public Hamburger(String name, String breadRollType, String meat, double basicPrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basicPrice = basicPrice;
    }

    public Hamburger(String breadRollType, String meat, double basicPrice) {
        this.name = "Hamburger";
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basicPrice = basicPrice;
    }

    public String getDetails() {
        String details = this.name + " Hamburger" + " on a " + this.breadRollType + " roll"
                + " for " + this.basicPrice + " €.\n";
        if (this.addition1 != null) {
            details += "plus " + this.addition1.getName()
                    + " for " + this.addition1.getPrice() + " €.\n";
        }
        if (this.addition2 != null) {
            details += "plus " + this.addition2.getName()
                    + " for " + this.addition2.getPrice() + " €.\n";
        }
        if (this.addition3 != null) {
            details += "plus " + this.addition3.getName()
                    + " for " + this.addition3.getPrice() + " €.\n";
        }
        if (this.addition4 != null) {
            details += "plus " + this.addition4.getName()
                    + " for " + this.addition4.getPrice() + " €.\n";
        }
        return details;
    }

    public void addAddition1(Additions addition1) {
        this.addition1 = addition1;
    }

    public void addAddition2(Additions addition2) {
        this.addition2 = addition2;
    }

    public void addAddition3(Additions addition3) {
        this.addition3 = addition3;
    }

    public void addAddition4(Additions addition4) {
        this.addition4 = addition4;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public double getTotalPrice() {
        double additionsPrice = 0;
        additionsPrice += (addition1 != null) ? addition1.getPrice() : 0;
        additionsPrice += (addition2 != null) ? addition2.getPrice() : 0;
        additionsPrice += (addition3 != null) ? addition3.getPrice() : 0;
        additionsPrice += (addition4 != null) ? addition4.getPrice() : 0;
        return basicPrice + additionsPrice;
    }
}
