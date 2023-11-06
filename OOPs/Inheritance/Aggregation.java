class Address {
    String city, state, country;
    Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Student {
    int rollNo;
    String name;
    Address address;
    
    Student(int rollNo, String name, Address address) { // Aggregation
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.city + ", " + address.state + ", " + address.country);
        // System.out.println(address);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address address = new Address("Pune", "Maharashtra", "India");
        Student student = new Student(104, "Bharvi", address);

        student.display();
    }
}
