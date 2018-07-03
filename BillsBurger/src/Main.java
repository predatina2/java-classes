public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        Hamburger basicHamburger = new Hamburger("Basic Hamburger"
                , "wheat", "beef", 5);
        basicHamburger.addAddition1(new Banana());
        basicHamburger.addAddition2(new Chicken());
        basicHamburger.addAddition3(new Chips());
        basicHamburger.addAddition4(new Cheese());

        System.out.println(basicHamburger.getDetails());
        System.out.println(basicHamburger.getBasicPrice());
        System.out.println(basicHamburger.getTotalPrice());

        HealthyHamburger healthyHamburger = new HealthyHamburger("beef"
                , 5);
        healthyHamburger.addAddition1(new Banana());
        healthyHamburger.addAddition2(new Peas());
        healthyHamburger.addAddition3(new Onions());
        healthyHamburger.addAddition4(new Chili());
        healthyHamburger.addAddition5(new Cheese());
        healthyHamburger.addAddition6(new Salad());

        System.out.println(healthyHamburger.getDetails());
        System.out.println(healthyHamburger.getBasicPrice());
        System.out.println(healthyHamburger.getTotalPrice());


        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Deluxe Burger"
                , "wheat", "beef", 9);

        deluxeHamburger.addAddition1(new Banana());
        System.out.println(deluxeHamburger.getDetails());
        System.out.println(deluxeHamburger.getBasicPrice());
        System.out.println(deluxeHamburger.getTotalPrice());
    }
}
