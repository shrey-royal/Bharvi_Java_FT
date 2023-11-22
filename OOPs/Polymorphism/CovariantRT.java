class Parent {
    Parent property() {
        System.out.println("Property of Parent");
        return this;    //returns the current object
    }

    void earn() {
        System.out.println("Earning 100000$");
    }
}

class Child extends Parent {
    @Override   //this annotation will make sure that the method is overridden
    Child property() {
        System.out.println("Property of Child");
        return this;    //returns the current object
    }

    void earn() {
        System.out.println("Earning 0$");
    }
}


public class CovariantRT {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.property().earn();

        Child c = new Child();
        c.property().earn();        
    }
}

/*
Covariant Return type specifies that the return type may vary in the same direction as the subclass.

Primitive Data Types are not covariant. (int, float, double, etc.)
Non-Primitive Data Types are covariant. (String, Array, etc.)


Adavntages of Covariant Return Type:

1. Covariant Return Type assits to stay away from the confusing type casts in the class hierarchy and makes the code more usable.
2. In the method overriding, the covaraint return type provides the liberty to have more to the point return types.
3. covariant rt helps in preventing the runtime ClassCastExceptions on returns.

*/