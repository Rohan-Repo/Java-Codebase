import java.util.Arrays;

// What is Class
// JavaTut is my class
public class JavaTut {

    public static void main(String[] args) {
        // Run everything I specify in the main() method
        // Variables Store Data and Identify the value
        // Type Name = Value
        // ; Denotes it's the end of that line of code

        // Primitive Data-Types in Java - int, float, double, char, boolean, byte, short
        // Built-into the Language, so we don't need to specify using the new keyword

        int num = 17;
        double shoeSize = 8.5;
        double multVal = num*shoeSize;

        char mySurnameInitial = 'D';


        System.out.println( "Number is : " + num + " and Character is : " + mySurnameInitial );
        System.out.println( "Multiplication Eg : " + multVal );

        String universityName = "University of Toronto";
        System.out.println( "String = " + universityName );
        System.out.println( "String-Length = " + universityName.length() );
        System.out.println( "String-LowerCase = " + universityName.toLowerCase() );

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
        // Method Call
        System.out.println( "Fun-> Person with age : " + age2 + " is allowed to Vote :" + isPersonAllowedToVote(age2) );

        // Defined the method but didn't call so didn't get Output
        // sayHello();
        String[] workAuthList = { "Citizen", "PR", "WP", "OWP", "GWP", "International-Candidate" };

        int retVal = 0;

        for (String authVal: workAuthList ) {
            retVal = authorizedToWork( authVal );

            if( retVal == 1 || retVal == 2 )
                System.out.println( authVal + " is Fully-Authorized to work in Canada" );
            else
                System.out.println( authVal + " is Not currently authorized to work in Canada, need to start LMIA/WP process" );
        }

        int[] nums = {1,-6,19,30,31,12,98};
        int[] evenNums = new int[5];
        int[] oddNums = new int[5];
        int i=0, j=0;

        for (int k=0; k<nums.length; k++ ) {
            if( nums[k]%2 == 0 )
                evenNums[i++] = nums[k];
            else
                oddNums[j++] = nums[k];
        }

        System.out.println( "Nums : " + Arrays.toString(nums) );
        System.out.println( "Evens : " + Arrays.toString(evenNums) );
        System.out.println( "Odds : " + Arrays.toString(oddNums) );

        // Other Types of loops would be doWhile and while

        // Static method call - Call using the Class directly as it is common to all Objects
        System.out.println( "Can Dogs make a Sound : " + Dog.makesSound() );

        Dog myDog = new Dog();
        myDog.name = "Marley";
        myDog.age = 1;

        System.out.println( "The Dog's name is : " + myDog.name + " and it is " + myDog.age + " years old" );
        myDog.canBark();

    }

    //Method Declaration - Returns a value
    public static boolean isPersonAllowedToVote(int age) {
        if( age >= 18 )
            return true;
        else
            return false;
    }

    public static void sayHello() {
        System.out.println( "Hello From sayHello()" );
    }

    // public means the method can be called from anywhere
    // private means the method can be called only by this class

    private static int authorizedToWork(String status) {
        if( status.equalsIgnoreCase("PR") || status.equalsIgnoreCase("Citizen") )
            return 1;
        else if( status.equalsIgnoreCase("WP") || status.equalsIgnoreCase("GWP") ||
                status.equalsIgnoreCase("OWP") )
            return 2;
        else
            return 3;
    }
}
