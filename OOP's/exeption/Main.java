package exeption;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
      //  int c = a/b;
        //System.out.println(c);
        try {
            String name  ="bhagy";
            if (name.equals("bhagya")){
                throw new MyExeption("name is bhagya");
            }
            //div(3,0);
        }catch (MyExeption e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal exeption");
        }finally {
            System.out.println("this will always execute");
        }
    }
    static int div(int a , int b ) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a/b;
    }
}
// difference between throw and throws
//          throw                        |                  throws
// this  throw  keyword  is used to      |   this throws keyword is used to
// throw an error as we seen above       |   to given method which say that there is maybe expetion in the method