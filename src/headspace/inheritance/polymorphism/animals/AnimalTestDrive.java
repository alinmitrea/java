package headspace.inheritance.polymorphism.animals;

/**
 * Created by micro on 08/01/2017.
 */
public class AnimalTestDrive {
    public static void main(String[] args){
        MyAnimalList list = new MyAnimalList();
        Dog d = new Dog();
        Cat c = new Cat();
        list.add(d);
        list.add(c);

        System.out.println(c.getClass());
        System.out.println(c.hashCode());
    }
}
