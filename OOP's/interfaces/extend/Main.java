package interfaces.extend;

public class Main implements A,B {
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        // call make via interface names
        A.car();
    }
}
