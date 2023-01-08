//package test;
//
////public class test1 {
//  public class Msg {
//        public Msg() {  //phuong thuc khoi tao (constructor)
//            System.out.println("Hellooo");
//        }
//        public void sayGoodbye() {
//            System.out.println("Goodbye 1");
//        }
//    }
//    class TestMsg extends Msg {
//        public TestMsg() {
//            super();  // Trong java, super() được sử dụng để gọi trực tiếp Constructor của lớp cha. // nó in ra chữ Hellooo
//            System.out.println("Hello java");
//        }
//        public void sayGoodbye(){
//            System.out.println("Goodbye java1");
//        }
//    }
//    class Demo {
//        public static void main(String[] args) {
//            Msg m1 = new Msg();  // 1
//            Msg m2 = new TestMsg();  // 2
//            m1.sayGoodbye();  // 3
//            m2.sayGoodbye();  // 4
//
//        }
//
//    }
//    // Trong java chạy hàm main đầu tiên.
//    // hàng 1 =>  Msg m1 = new Msg(); => khởi tạo Msg => chạy contructor -> System.out.println("Hellooo");
//    // hàng 2 =>  Msg m2 = new TestMsg()  => chạy contructor TestMsg =>
//    //            super();  // Trong java, super() được sử dụng để gọi trực tiếp Constructor của lớp cha. ->  System.out.println("Hellooo");
//    //            System.out.println("Hello java");  => Hello java
//    //
//    //  m1.sayGoodbye();  => m1 : là tên để tham chiếu của đối tượng
//    //                => System.out.println("Goodbye 1");
//    //  m2.sayGoodbye(); => System.out.println("Goodbye java1");