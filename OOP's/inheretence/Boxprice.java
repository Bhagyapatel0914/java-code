package inheretence;

public class Boxprice extends Boxweight {
    double price;
    Boxprice(){
        super();
        this.price = -1;
    }

    public Boxprice(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
}
