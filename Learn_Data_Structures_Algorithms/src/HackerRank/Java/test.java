package HackerRank.Java;

abstract class test {
    //hàm abstract
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat.");
    }
    public void choi() {
        System.out.println("đi bay");
    }
}
class test1 extends  test {
    @Override
    void makeSound() {
        System.out.println("123");
    }
}
class Main {
    public static void main(String[] args) {
        test abc = new test1();
        abc.choi();
        abc.makeSound();
        abc.eat();
    }
}


//    abstract class Animal {
//        //hàm abstract
//        abstract void makeSound();
//        public void eat() {
//            System.out.println("I can eat.");
//        }
//    }
//
//    class Dog extends Animal {
//        //định nghĩa hàm abstract của lớp cha ở lớp con
//        @Override
//        public void makeSound() {
//            System.out.println("Bark bark");
//        }
//    }
//
//    class Main {
//        public static void main(String[] args) {
//            //tạo một đối tượng của lớp Dog
//            Dog d1 = new Dog();
//            d1.makeSound();
//            d1.eat();
//        }
//    }

