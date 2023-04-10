package polymorphism;
// overloading means one or more than methods has same name but their arguments or order are different
// as shown below
public class staticpolymorphismOverloading {
    int sum(int a , int b){
        return a+b;
    }
    int  sum(int a ,int b , int c){
        return a+b+c ;
    }

    public static void main(String[] args) {
        // If i pass two arguments here it will autometically call the funtion with
        // two arguments and if we pass three then it will call three one and other accordingly
        staticpolymorphismOverloading obj = new staticpolymorphismOverloading();
        System.out.println(obj.sum(12,13,10));
        System.out.println(obj.sum(12,2));
    }
}
