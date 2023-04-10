package Static;
// Now as we know from previous examples that anything put inside
// static data should be static

// At first lets create class inside class
public class Internalclass {
    static  class human {
             String name;

        public human(String name) {
            this.name = name;
        }
        // Now to print name we have to make main class

        @Override
        public String toString() {
            return name ;
        }
    }

    public static void main(String[] args) {
        // human obj = new human();
        // As we can see it show error because we can't do it
        // define human class is static or not because
        // as outer also not defined so we have to make the human class static
        // because as we know we can only put static data only  in static method
        // and also inner class is depend upon outer class thaat is one of reason
        // as when human class put outside we don't worry about it because it is independent
        human obj = new human("bhagya");
        human obj2 = new human("maths");
        System.out.println(obj.name);
        System.out.println(obj2.name);
        // So here System is the class where the out is variable which is consist of
        // of the println method which call to string method

        // Now try to print obj
//        System.out.println(obj);
        // it will give some random value  because internally it call to string method and obj does not
        // consist of to String let add and then try to print
        System.out.println(obj);
        // Now it will print the name bhagya
    }
}
// if we put the human class outside it should not be static because it is just a templete
// of the class it does not depend upon the class which is not static and just provide templete
 class human {
    String name;

    public human(String name) {
        this.name = name;
    }
}
// Some other things to be done
// 1) Put the String name as static it will print only second one two times
// because object is set to the maths
// we get maths particullarly for this programm three times