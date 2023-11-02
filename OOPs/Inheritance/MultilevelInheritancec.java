
class GrandFather {
    public void experience() {
        System.out.println("I have 40 years of experience");
    }
}

class Father extends GrandFather {
    public void skills() {
        System.out.println("I have Java skills");
    }
}

class Child extends Father {
    public void knowledge() {
        System.out.println("I have knowledge of Java");
    }
}

public class MultilevelInheritancec {
    public static void main(String[] args) {
        Child c = new Child();
        c.knowledge();
        c.skills();
        c.experience();
        
    }
}
