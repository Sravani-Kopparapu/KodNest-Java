
class A {

    void m1(String a, String b) {
        System.out.println("String method" + a + " " + b);
    }

    void m1(A a, A b) {
        System.out.println("Int method" + a + " " + b);
    }
}

class AmbiguityMO {

    public static void main(String[] args) {
        A a = new A();
        a.m1(null, null); // both are no primitive type values and both the methods are accepting non primitive as parameters, so here rises the ambiguity.
    }
}
