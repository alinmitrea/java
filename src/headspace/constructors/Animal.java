package headspace.constructors;

/**
 * Created by micro on 13/01/2017.
 */
public class Animal {
    private String name;

    public Animal(){
        System.out.println("Making an animal");
    }

    public Animal(String theName){
        name = theName;
    }
    public String getName(){
        return name;
    }
}
