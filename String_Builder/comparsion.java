public class Compo {
    public static void main(String[] args) {
        // Both the variable pointing towards same object in pool of heap
//        String a = "Bhagya";
//        String b = "Bhagya";
//        System.out.println(a==b);
        // Here two variable pointing toward two different object which created outside pool of heap
        String a = new String("Bhagya");
        String b = new String("Bhagya");
        System.out.println(a==b);
        // if now compare value
        System.out.println(a.equals(b));
    }
}
