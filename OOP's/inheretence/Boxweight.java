package inheretence;

public class Boxweight extends box {
    double weight;
    Boxweight(){
       this.weight = -1;
    }
    Boxweight(Boxweight other){
        super(other);
        weight = other.weight;
    }

    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w); // super keyword we can access all the variable of above class
        // something like
        System.out.println(this.weight);
        // Let's say we have another variable as weight in the parent class then
        // to particularlly access the weight in the parent class we used super instead of this
      //  System.out.println(super.weight);


        // this above thing used to initialze value of parents class
        // this thing internally calling parent class constructor
        this.weight = weight;
    }
}
