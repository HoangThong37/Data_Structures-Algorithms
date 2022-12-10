package de_quy;

public interface A {
    void a();
    abstract void b();
    public void c();
    public abstract void d();
}
abstract class B implements A {
//    @Override
    public void c() {
        System.out.println("HELO");
    }
}
class M extends B {

    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }


    @Override
    public void d() {
        System.out.println("D");
    }
}
class Test44 {
    public static void main(String[] args) {
        A interface1 = new M();
        interface1.a();
        interface1.b();
        interface1.c();
        interface1.d();
        //A test = new M();
//test.a();
//test.b();
//test.c();
//test.d();
//    }
    }
}