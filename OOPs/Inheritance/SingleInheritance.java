
class Parent {
    protected double property;
    
    protected void setProperty(double property) {
        this.property = property;
    }

    public void eat() {
        System.out.println("Eating...");
    }
}

class Bharvi extends Parent {    
    public void setProperty(double property) {
        super.setProperty(property);
    }

    public void getProperty() {
        System.out.println("Property: " + super.property);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Bharvi b = new Bharvi();
        b.setProperty(1000000);
        b.getProperty();
        b.eat();
    }
}
