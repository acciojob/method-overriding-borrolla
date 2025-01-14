package com.driver;
class A{
    //Task 1:
    // * create a class A, with a method named meth having returning a string
    // * "Invoking method from class A"
     String meth() {
         return "Invoking method from class A";
     }
}
// Task 2:
// * create a class B which extends class A
class B extends A{
   //Task 4:
    // * Now override methode `meth` of class A in class B, which returns the following string
   String meth()
   {
       return "Method is overridden in Extend end class B";
   }
}

//Task 3:
// * create object of class B and call method `meth` of class A with it

//Task 5:
// * call this overridden method from obj of class B
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        //calling this method from obj of class B
        System.out.println(obj.meth());


    }
}