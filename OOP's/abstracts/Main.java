package abstracts;

public class Main {
    public static void main(String[] args) {
        //Son son = new Son(12);
//        Lets try something like this
        Parents son = new Son(12);
        // Here lhs decides what to run and right describe which one to run
        son.career();
        son.partner();
        // Now lets say we have parent2 which we consider mother
        // Now for mother the career and partner may be differ either  for son
        // or for daughter
        // Hence in such case interfaces comes in the role as multi inheretence is  not possible
    }
}
