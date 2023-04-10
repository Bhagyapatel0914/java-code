package compere;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        student Bhagya = new student(12, 99.25f);
        student vinny = new student(29, 98.00f);
        student garv = new student(27, 100.00f);
        student krish = new student(29, 80.00f);
        student tirth = new student(29, 287.00f);
        student [] list = {Bhagya , vinny , garv , krish , tirth};
        // it will print the marks
        System.out.println(Arrays.toString(list));
        // let's try to sort the marks array
      //  Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        // if we remove the compareto method then it will not sort
        // if we remove previous compare to we do something like this



        Arrays.sort(list, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));

        // Let's use the lamada funtion
        Arrays.sort(list,(o1,o2) -> (int)(o1.marks-o2.marks));

//        if(Bhagya.compareTo(vinny)<0){
//            System.out.println("bhagya has more marks");
//        }
//        System.out.println("vinny has more marks");
//    }
    }
}