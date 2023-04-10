package Singeltonclass;

public class singelton {
    // I can access this constructor in same package as we know all
//   public singelton(){
//
//    }
    // If i make it private i can't access it anywhere else than the class it self
    private singelton(){

    }
    // Now make the instance of the singolton class
    // Make this things static because we have to put instance in the
    // main which is static
    private static singelton instance;
    public static singelton getInstance(){
        if(instance == null){
            instance = new singelton();
        }
        return instance;
    }
}
