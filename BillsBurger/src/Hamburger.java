public class Hamburger {

    private static final int MAX_ADDITIONS = 4;

    private String name;
    private String breadRollType;
    private String meat;
    private double basicPrice;

    private Addition[] additions;
    private int additionsCount = 0;

    public Hamburger(String name, String breadRollType, String meat, double basicPrice) {
        this(name, breadRollType, meat, basicPrice, MAX_ADDITIONS);
    }

    public Hamburger(String breadRollType, String meat, double basicPrice) {
        this("Hamburger", breadRollType, meat, basicPrice);
    }

    protected Hamburger(String name, String breadRollType, String meat, double basicPrice
        , int maxAdditions) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basicPrice = basicPrice;
        this.additions = new Addition[maxAdditions];
    }

    public String getDetails() {
        String details = this.name + " on a " + this.breadRollType + " roll"
                + " for " + this.basicPrice + " €.\n";
        for (int i = 0; i < additionsCount; i++) {
            details += "plus " + this.additions[i].getName()
                    + " for " + this.additions[i].getPrice() + " €.\n";
        }
        return details;
    }

    public void addAddition(Addition addition) {
        if ( additionsCount < this.additions.length) {
            this.additions[additionsCount] = addition;
            additionsCount++;
        } else {
            System.out.println("You can't add more additions");
        }
    }

    public double getBasicPrice() {
        return this.basicPrice;
    }

    public double getTotalPrice() {
        double totalPrice = this.basicPrice;
        for (int i = 0; i < this.additionsCount; i++) {
            totalPrice += additions[i].getPrice();
        }
        return totalPrice;
    }

}
