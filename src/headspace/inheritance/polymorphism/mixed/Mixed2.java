package headspace.inheritance.polymorphism.mixed;

/**
 * Created by micro on 04/01/2017.
 */
public class Mixed2 {
    public static void main(String [] args){
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        b.m1();
        c.m2();
        c.m3();
        a.m3();
        c.m1();
    }
}
