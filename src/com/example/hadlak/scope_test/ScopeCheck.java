package com.example.hadlak.scope_test;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = "
                    + publicVar + ": + varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int varTwo = 2;
        for (int i = 0; i < 10; i++){
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: = " + innerClass.varThree);
    }

    public class InnerClass {
        public int varThree = 3;

        public InnerClass(){
            System.out.println("Inner Class created, varOne is " + varOne + " varThree = " + varThree);
        }

        public void timesTwo(){
            ScopeCheck.this.timesTwo();
            System.out.println("var one is still available here: " + varOne);
            int varFive = 3;
            for (int i = 0; i < 10; i++){
                System.out.println(i + " times two is " + i * varFive);
            }
        }
    }
}
