package headspace.inheritance.polymorphism.animals;

/**
 * Created by micro on 08/01/2017.
 */
public class CastAndInstanceOfTestDrive {
    public static void main(String[] args){
        Object bucket = new Dog();
        Dog d;
        if (bucket instanceof Dog){
            d = (Dog) bucket;
        }
    }
}
