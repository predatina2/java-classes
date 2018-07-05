public class Hamburger {

    private static int maxAdditions = 4;

    private String name;
    private String breadRollType;
    private String meat;
    private double basicPrice;

    private Additions[maxAdditions] additions;
    private int additionsCount = 0;

    public Hamburger(String name, String breadRollType, String meat, double basicPrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basicPrice = basicPrice;
        this.Additions[maxAdditions] = new Additions[maxAdditions]
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
        for (int i = 0; i < additionsCount + 1; i++) {
            details += "plus " + this.additions[i].getName()
                    + " for " + this.additions[i].getPrice() + " €.\n";
        }
        return details;
    }

    public void addAddition(Additions addition) {

        if (additionsCount < maxAdditions) {
            this.Additions[additionsCount] = addition;
            additionsCount++;
        } else {
            System.out.println("You can't add more additions")
        }
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
