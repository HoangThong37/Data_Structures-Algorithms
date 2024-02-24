package Leetcode.programming.two_pointers;

public class test {
    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println("Trước khi gọi phương thức: person = " + person.getName());
        modifyReference(person);
        System.out.println("Sau khi gọi phương thức: person = " + person.getName());
    }

    public static void modifyReference(Person p) {
        p.setName("Alice");
        System.out.println("Trong phương thức: person = " + p.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
