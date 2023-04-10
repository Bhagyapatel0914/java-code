package abstracts;

public class Daughter extends Parents {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void partner() {
        System.out.println("I love ___");
    }

    @Override
    void career() {
        System.out.println("I want to be engineer");
    }
}
