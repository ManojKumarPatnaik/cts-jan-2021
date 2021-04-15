class A {
    B test1() {
        return null;
    }
}
class B extends A {
    A test1() {
        return null;
    }
}
class C extends B {
    C test1() {
        return null;
    }
}
class Test {
    public static void main(String[] args) { 
    
    }
}