package sorting;

public class patterntriangle{
    public static void main(String[] args) {
        int r = 4;
        int c = 0;
//        tri(4,0);
        tri2(4,0);
    }
    public static void tri(int r , int c){
            if(r==0){
                return;
            }
            if(c<r){
                System.out.print("*");
                tri(r,c+1);
            }else{
                System.out.println();
                tri(r-1,0);
            }
    }
    public static void tri2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            tri2(r,c+1);
            System.out.print("*");
        }else{
            tri2(r-1,0);
            System.out.println();
        }
    }
    }
