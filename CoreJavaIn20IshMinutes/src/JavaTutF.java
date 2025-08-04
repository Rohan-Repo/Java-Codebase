public class JavaTutF {
    public static void main(String[] args) {

        // Variables Store Data and Identify the value
        // Classes imitate Real-world Objects
        // Just like C & C++, the main() method is the Entry Point to your Java Code

        int pAge = 30;
        double pWeight = 85.5;
        String pFirstName = "John";
        String pLastName = "Doe";
        char pMiddleNameInitial = 'V';

        System.out.println( "Person - Age is : " + pAge + " and Weight is : " + pWeight );

        String pName = pFirstName + " " + pMiddleNameInitial + ". " + pLastName;
        System.out.println( "Person - Name: " + pName );

        System.out.println( "String-Length = " + pName.length() );
        System.out.println( "String-LowerCase = " + pName.toLowerCase() );
        System.out.println( "String-Position of Dot = " + pName.indexOf('.') );

        // Conditionals & Functions
        boolean validForVoting = false;
        int age1 = 21;
        int age2 = 15;

        if( age1 >= 18 )
            validForVoting = true;

        System.out.println( "Person with age : " + age1 + " is allowed to Vote :" + validForVoting );

        validForVoting = false;

        if( age2 >= 18 )
            validForVoting = true;

        System.out.println( "Person with age : " + age2 + " is allowed to Vote :" + validForVoting );

        // Remove Redundancy - Can be used to avoid repetitive tasks by creating functions
        System.out.println( "Fun-> Person with age : " + age1 + " is allowed to Vote :" + isPersonAllowedToVote(age1) );
        System.out.println( "Fun-> Person with age : " + age2 + " is allowed to Vote :" + isPersonAllowedToVote(age2) );

        // Defined the method but didn't call so didn't get Output
        // sayHello();

        // Loops
        int l = 0;
        char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
        System.out.print( "Vowels in English Alphabets are: " );

        while( l<5 ) {
            System.out.print( vowels[l] + "," );
            l++;
        }

        System.out.print( "\nList of Odd Numbers: ");
        for( int i=1; i<20; i=(i+2) ) {
            if( i==5 || i==9 || i==13 )
                continue;
            else if ( i==17 ) {
                System.out.print(i + "\n");
                break;
            }
            else
                System.out.print(i + ",");
        }
        // Other Types of loops would be doWhile and foreach

        // Static method call - Call using the Class directly as it is common to all Objects
        System.out.println( "Can Dogs make a Sound : " + Dog.makesSound() );

        Dog myDog = new Dog();
        myDog.name = "Marley";
        myDog.age = 1;

        System.out.println( "The Dog's name is : " + myDog.name + " and it is " + myDog.age + " years old" );
        myDog.canBark();

        Headphone hp1 = new Headphone( "Bose", "Black", 1, true );
        System.out.println( hp1.toString() );

        Headphone hp2 = new Headphone( "Sony", "White", 2, false );
        System.out.println( hp2.toString() );
    }

    // Function Definition
    public static boolean isPersonAllowedToVote(int age) {
        if( age >= 18 )
            return true;
        else
            return false;
    }

    private static void sayHello() {

        System.out.println( "Hello From sayHello()" );
    }

}
