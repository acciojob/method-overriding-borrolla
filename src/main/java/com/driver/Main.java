package com.driver;
//Task 1:
// * create a class A, with a method named meth having returning a string
// * "Invoking method from class A"
class A{
     String meth() {

         return "Invoking method from class A";
     }
}

// Task 2:
// * create a class B which extends class A

class B extends A{
    //Task 4:
    // * Now override methode `meth` of class A in class B, which returns the following string
    @Override
   String meth()
   {

       return "Method is overridden  Extendend class B";
   }
}

//Task 3:
// * create object of class B and call method `meth` of class A with it

//Task 5:
// * call this overridden method from obj of class B

public class Main {
    public static void main(String[] args)
    {
        B objB = new B();
        //calling this method from obj of class B
        System.out.println(objB.meth());

    }
}

//one more line added