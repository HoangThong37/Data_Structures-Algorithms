package test;

class Outer_Demo {
    private int num = 175;

    class Inner_class {
        public int getNum() {
            System.out.println("From the  inner class");
            return num;
        }
    }
    public static void main(String[] args) {
        Outer_Demo test = new Outer_Demo();
        Outer_Demo.Inner_class in = test.new Inner_class();
        System.out.println(in.getNum());
    }
}

