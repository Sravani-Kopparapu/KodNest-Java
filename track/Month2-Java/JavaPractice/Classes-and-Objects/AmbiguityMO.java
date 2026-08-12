
class A {

    void m1(short a, short b) {
        System.out.println("short method" + a + " " + b);
    }

    void m1(int a, int b) {
        System.out.println("Int method" + a + " " + b);
    }
}

class AmbiguityMO {

    public static void main(String[] args) {
        A a = new A();
        a.m1(1, 1);
    }
}
