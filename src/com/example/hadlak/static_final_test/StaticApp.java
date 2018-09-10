package com.example.hadlak.static_final_test;

public class StaticApp {


    public static void main(String[] args) {
//        FinalTest firstInstance = new FinalTest("1st Instance");
//        System.out.println(firstInstance.NAME + " is instance number "
//                + firstInstance.INSTANCE_NUMBER);
//
//        FinalTest secondInstance = new FinalTest("2nd Instance");
//        System.out.println(secondInstance.NAME + " is instance number "
//                + secondInstance.INSTANCE_NUMBER);
//
//        FinalTest thirdInstance = new FinalTest("3nd Instance");
//        System.out.println(thirdInstance.NAME + " is instance number "
//                + thirdInstance.INSTANCE_NUMBER);
//        System.out.println(firstInstance.INSTANCE_NUMBER);
//        System.out.println(secondInstance.INSTANCE_NUMBER);
//        System.out.println(thirdInstance.INSTANCE_NUMBER);
//
//        System.out.println("total instances: " + FinalTest.getClassCounter());
//
//        System.out.println("PI: " + Math.PI);
//
//        Password password = new ExtendedPassword((1234));
//        password.storePassword();
//        password.letMeIn(1234);
//        password.letMeIn(12345);

        System.out.println("Main method called");
        SIBTest sibTest = new SIBTest();
        sibTest.secondMethod();
        SIBTest sibTest1 = new SIBTest();

    }

}
