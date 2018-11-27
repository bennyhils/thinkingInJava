public class Main {
    public static void main(String[] args) {
        FloatClass f1 = new FloatClass();
        FloatClass f2 = new FloatClass();
        f1.f = 101;
        f2.f = 102;
        System.out.println("f1 = " + f1.f+",  f2 = " + f2.f);
        f1 = f2;
        System.out.println("f1 = " + f1.f+",  f2 = " + f2.f);
        f1.f=1000;
        System.out.println("f1 = " + f1.f+",  f2 = " + f2.f);
    }
}