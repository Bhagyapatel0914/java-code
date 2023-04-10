package interfaces.nested;

public class A {
    public interface nested{
        boolean isodd(int num);
    }
}
class B implements A.nested{
    @Override
    public boolean isodd(int num) {
        return (num & 1) == 1;
    }
}