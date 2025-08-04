public class Dog {
    // Class is a Blueprint to create objects
    // What attributes this Dog has

    String name;
    int age;

    public static boolean makesSound() {
        return true;
    }

    public void canBark() {
        System.out.println( "Dogs can make a sound - Woof" );
    }
}
