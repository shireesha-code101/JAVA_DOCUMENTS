package practice.Inhertance;

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("Method from A implemented in C");
    }
    public void methodB() {
        System.out.println("Method from B implemented in C");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
