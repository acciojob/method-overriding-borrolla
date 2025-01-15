package com.driver;
//Task 1:
// * create a class A, with a method named meth having returning a string
// * "Invoking method from class A"

//Task 3:
// * create object of class B and call method `meth` of class A with it

//Task 5:
// * call this overridden method from obj of class B


public class Main {
    public static class A
    {
        public String meth()
        {
            return "Invoking method from class A";
        }
    }
    public static class B extends com.driver.A
    {
        public String meth()
        {
            return "Method is overridden in Extend class B";
        }
    }

    public static void main(String[] args)
    {
        B objB = new B();
        //calling this method from obj of class B
        System.out.println(objB.meth());

    }
}

//added one more line

