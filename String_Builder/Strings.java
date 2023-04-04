public class Strings {
    public static void main(String[] args) {
            String str = "Bhagya";
        System.out.println(str);
        // It will not modify object but create new object in pool
        str = "patel";
        System.out.println(str);
    }
}
