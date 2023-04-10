package inheretence;

public class Main {
    public static void main(String[] args) {
       box box = new box();
      //  box box1 = new box(box);
//        Boxweight box2 =new Boxweight();
//        System.out.println(box2.weight);
//        System.out.println(box.l+" "+ box.h+" "+ box.w);
//        // Now suppose i want to do something like pass four things
//        // Boxweight box3 = new Boxweight(l,h,w,weight);
//         Boxweight box3 = new Boxweight(20,40,50,60);
//        System.out.println(box3.l+" "+ box3.h+" "+ box3.w+" "+box3.weight);

        // General points to mentions :-
        // Downward classes has the information of the upper classes
        // But upper classes doesn't have accesse to the variable
        // of the downward classes

      //  box box4 = new Boxweight();
        // here the object is pointing towards box weight hence we can access all the variable
        // in the box we can access the variables of the box class as class type is box
        //  we can't access the weight the weight here
        // as it  throws error when we try to access the weight
        // System.out.println(box4.weight);
      //  System.out.println(box4.l);

        // Now let say we put the reference of object as the boxweight which is  child
        // and put the object as the parent wwhich is box
         // Boxweight box5 = new box(20,10,20);
        // It throws error as the above class doesn't access below class
        Boxweight box10 = new Boxweight();
        Boxweight box11 = new Boxweight(box10);

      //  System.out.println(box11.weight);


       Boxprice box9 = new Boxprice(12,20,30,40,80);
        System.out.println(box9.l+" "+ box9.h+" "+ box9.w+" "+box9.weight+" "+box9.price);
    }
}