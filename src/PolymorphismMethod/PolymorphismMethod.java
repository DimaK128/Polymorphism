    // 1.1.1 Create a superclass with a method (theMethod).
class Superclass {
    public void theMethod() {
        System.out.println("Method in Superclass");
    }
}

    // 1.1.2 Extend superclass with subclass.
class Subclass extends Superclass {
    // 1.1.3 Override the method of the superclass in the subclass.
    @Override
    public void theMethod() {
        System.out.println("Method in Subclass");
    }
}

public class PolymorphismMethod {
    public static void main(String[] args) {
        // 1.1.4 Create a variable of the superclass type and assign to it a new instance of the subclass
        Superclass a = new Subclass();

        // 1.1.5 Call theMethod for this object.
        a.theMethod();
        // 1.1.6 This will call the overridden method in the subclass
    }
}
