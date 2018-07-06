public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        Hamburger basicHamburger = new Hamburger("wheat", "beef", 5);
        basicHamburger.addAddition(Addition.createBanana());
        basicHamburger.addAddition(Addition.createChicken());
        basicHamburger.addAddition(Addition.createChips());
        basicHamburger.addAddition(Addition.createCheese());

        System.out.println(basicHamburger.getDetails());
        System.out.println(basicHamburger.getBasicPrice());
        System.out.println(basicHamburger.getTotalPrice());

        HealthyHamburger healthyHamburger = new HealthyHamburger("beef"
                , 5);
        healthyHamburger.addAddition(Addition.createBanana());
        healthyHamburger.addAddition(Addition.createPeas());
        healthyHamburger.addAddition(Addition.createOnions());
        healthyHamburger.addAddition(Addition.createChili());
        healthyHamburger.addAddition(Addition.createCheese());
        healthyHamburger.addAddition(Addition.createSalad());
        healthyHamburger.addAddition(Addition.createChips());

        System.out.println(healthyHamburger.getDetails());
        System.out.println(healthyHamburger.getBasicPrice());
        System.out.println(healthyHamburger.getTotalPrice());


        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Deluxe Burger"
                , "wheat", "beef", 9);

        deluxeHamburger.addAddition(Addition.createBanana());
        System.out.println(deluxeHamburger.getDetails());
        System.out.println(deluxeHamburger.getBasicPrice());
        System.out.println(deluxeHamburger.getTotalPrice());
    }
}
