package inheretence;

public class box {
    // if we make it private we can only access private  only in this file hence as it show error as we aceess it
    // at two other places
//    private double l;
    double l;
    double h;
    double w;
   // double weight ;
    box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    box(double l,double h,double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    // cube
    box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    box(box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
