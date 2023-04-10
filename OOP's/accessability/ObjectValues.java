package accessability;

public class ObjectValues {
    int num;
    float gpa;

    public ObjectValues(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
        // if return number
       // return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectValues)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // It will give some random value
    @Override
    public String toString() {
        return super.toString();
    }
    // This hits when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    // For hashcode
    public static void main(String[] args) {
        // It give the value specified to the object
        // if we make another obj and put the same value it will give diff ans
//        ObjectValues obj = new ObjectValues(23);
//        ObjectValues obj2 = new ObjectValues(23);
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
//        ObjectValues obj = new ObjectValues(23);
//        ObjectValues obj2 = new ObjectValues(25);
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
        // from this we can say that the hashcode is value of object
        // it is not an addres



        // for equal funtion
        ObjectValues obj1 = new ObjectValues(23,58.6f);
//        ObjectValues obj2 = new ObjectValues(25,29.30f);
        ObjectValues obj2 = new ObjectValues(23,29.30f);
        // this will compare objects
        if (obj1 == obj2){
            System.out.println("objects are equal");
        }
        // this will compare value or content of the object
        if (obj1.equals(obj2)){
            System.out.println("objects are equal");
        }
    }
}
