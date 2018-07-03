public class Additions {

    private String name;
    private double price;

    public Additions(String name, double price) {
       this.name = name;
       this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Banana extends Additions {

    private static double price = 1.45;

    public Banana() {
        super("Banana", price);
    }
}

class Cheese extends Additions {

    private static double price = 2.0;

    public Cheese() {
        super("Cheese", price);
    }
}

/* meat */

class Salami extends Additions {

    private static double price = 2.2;

    public Salami() {
        super("Salami", price);
    }
}

class Sausages extends Additions {

    private static double price = 2.1;

    public Sausages() {
        super("Sausages", price);
    }
}

class Chicken extends Additions {

    private static double price = 1.5;

    public Chicken() {
        super("Chicken", price);
    }
}

class Chorizo extends Additions {

    private static double price = 1.80;

    public Chorizo() {
        super("Chorizo", price);
    }
}

class BoiledHam extends Additions {

    private static double price = 2.50;

    public BoiledHam() {
        super("BoiledHam", price);
    }
}

/* vegetables */

class Peas extends Additions {

    private static double price = 1.19;

    public Peas() {
        super("Peas", price);
    }
}

class Onions extends Additions {

    private static double price = 1.00;

    public Onions() {
        super("Onions", price);
    }
}

class Chili extends Additions {

    private static double price = 0.50;

    public Chili() {
        super("Chili", price);
    }
}

class Salad extends Additions {

    private static double price = 0.80;

    public Salad() {
        super("Salad", price);
    }
}

class Tomatos extends Additions {

    private static double price = 1.50;

    public Tomatos() {
        super("Tomatos", price);
    }
}

/* sauces */

class Ketchup extends Additions {

    private static double price = 0.90;

    public Ketchup() {
        super("Ketchup", price);
    }
}

class Mayonnaise extends Additions {

    private static double price = 0.70;

    public Mayonnaise() {
        super("Mayonnaise", price);
    }
}

/* menu */

class Chips extends Additions {

    private static double price = 4.70;

    public Chips() {
        super("Chips", price);
    }
}

class Drinks extends Additions {

    private static double price = 2.30;

    public Drinks() {
        super("Drinks", price);
    }
}
