public class Addition {

    private String name;
    private double price;

    private Addition(String name, double price) {
       this.name = name;
       this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /* fruits */
    public static Addition createBanana(){
        return new Addition("Banana", 1.45);
    }

    /* vegetables */
    public static Addition createPeas(){
        return new Addition("Peas", 1.19);
    }

    public static Addition createOnions(){
        return new Addition("Onions", 1.0);
    }

    public static Addition createChili(){
        return new Addition("Chili", 0.5);
    }

    public static Addition createSalad(){
        return new Addition("Salad", 1);
    }

    /* cheese */
    public static Addition createCheese(){
        return new Addition("Cheese", 2.0);
    }

    /* meat*/
    public static Addition createSalami(){
        return new Addition("Salami", 2.2);
    }

    public static Addition createSausages(){
        return new Addition("Sausages", 2.1);
    }

    public static Addition createChicken(){
        return new Addition("Chicken", 1.5);
    }

    public static Addition createChorizo(){
        return new Addition("Chorizo", 1.8);
    }

    public static Addition createBoiledHam(){
        return new Addition("BoiledHam", 2.5);
    }

    /* sauces */
    public static Addition createKetchup(){
        return new Addition("Ketchup", 0.9);
    }

    public static Addition createMayonnaise(){
        return new Addition("Mayonnaise", 0.7);
    }

    /* side orders */

    public static Addition createChips(){
        return new Addition("Chips", 4.7);
    }

    public static Addition createDrinks(){
        return new Addition("Drinks", 2.3);
    }
}
