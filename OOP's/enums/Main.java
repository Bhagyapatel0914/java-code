package enums;

public class Main {
    enum weeks implements X{
        Monday , tuesday , wednusday , thursday , friday , saturaday , sunday;
         // the enums are constant
        // enums are public , static and final
        // since its final you cannot create child enums
        // type is week


        // we cannot do something like this
        // void dis();
        // we have to create the body
        void dis() {

        }


        // if the enums implement the interface we should have describe body
        // of implemented method
        @Override
        public void greet() {
            System.out.println("how are you ");
        }
    }

    public static void main(String[] args) {
        weeks Week ;
        Week = weeks.Monday;
        Week.greet();
        System.out.println(weeks.valueOf("Monday"));

         // ordinal means the index value
        System.out.println(Week.ordinal());
    }
}
