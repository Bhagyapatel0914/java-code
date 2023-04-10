package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class intro {
    // class is templet of object
    public static void main(String[] args) {
        // store the 5 rollnos
        int [] roll = new int[5];
        // to store name of 5 students
        String [] name = new String[5];
        // store  data of 5 students
        String [] names = new String[5];
        int [] rolls = new int[5];
        float []  marks = new float[5];
        // but it is not good
        // class consist of data of 5 student
        student [] students = new student[5];
        // bhagya is reference variable not intialize and it is consist of properties of class
          student bhagya ;
          // new dynamically allocate it and it executed during run time
          bhagya = new student(18 ,88.5f, "bhagya patel");
     //   System.out.println(Arrays.toString(students)); // it will give null
        //defult value of bhagya
        //System.out.println(bhagya); // it is random value initially
    //    System.out.println(bhagya.rolls = 18);
        //bhagya.marks = 88.5f;
        student random = new student(bhagya);
        student random2 = new student(12, 87.5f, "viki ");
        System.out.println(random2.name);
//        System.out.println(bhagya.marks);
//        System.out.println(bhagya.rolls); // let say we are not intialize marks we have default value in class
//        System.out.println(bhagya.name);
//        student kunal = new student();
//
//        bhagya.changename("GOAT");
//        bhagya.greet();
        student one = new student();
        student two = one ;
        two.name = "something else than default name";
        System.out.println(one.name);
    }
    // create a class which is contains property like marks and other
//    class student{
//        // names,roll& marks are instance variable
//        String name;
//        int  rolls ;
//        float  marks ;
//    }
    // now lets call random
    // Concept
    //student random = new student();
    // now this call the funtion in the class which is empty one

}
class student{
    // names,roll& marks are instance variable
    String name;
    int  rolls ;
    float  marks = 90f ;
    // as we see repetation in the dot operator
    void greet(){
        System.out.println(" hello , my name is " + this.name); // if we place this keyword over here
    }
    void changename(String newname){
       this.name = newname;
    }
//    student(){
//        this.rolls = 23;
//        this.marks = 88.5f;
//        this.name = "bhagya";
//    }
    // this is replace with the variable before .
//    student(int rolls , float marks ,String name ){
//        rolls = 23;
//        marks = 88.5f;
//        name = "bhagya";
//    }
    // here other is replace with kunal
    student(student other){
        this.rolls = other.rolls;
        this.marks = other.marks;
        this.name = other.name ;
    }
    // student arpit = new student(14 , 78.5,"arpit");
    // here this is replace with arpit
    student (){
        // this empty constructur will call another one
        // internally its like student(12, 87.5f, "default name ");
        this(12, 87.5f, "default name ");
    }
    student(int rolls , float marks ,String name ){
        this.rolls = rolls;
        this.marks = marks;
        this.name = name ;
    }
}
