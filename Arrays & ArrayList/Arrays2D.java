import javax.sql.rowset.spi.SyncResolver;

// This is concept of searching in matrix
// syntax --> datatype [][] variable = new datatype [rows size][columous size];
public class Arrays2D{
    public static void main(String[] args){
        int [][] arr = {
                {1,2,3,4,5},
                {12,11,87},
                {12,52,36,47,86}
        };
        System.out.println(arr[0][4]);
    }
}