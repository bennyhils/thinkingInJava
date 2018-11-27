class Dog {
    String name, says;
}
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "lusy";
        dog1.says = "gaaav";

        dog2.name = "Jecky";
        dog2.says = "chaaan";

        Dog dog3 = new Dog();

        dog1=dog3;

        System.out.println(dog1 == dog3);
        System.out.println(dog1.equals(dog3));
    }
}