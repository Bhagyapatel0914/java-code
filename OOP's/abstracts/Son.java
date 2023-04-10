package abstracts;

public  class Son extends Parents {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be pilot");
    }

    @Override
    void partner() {
        System.out.println("i love __");
    }
}
