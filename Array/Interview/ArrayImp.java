
import java.util.ArrayList;

public class ArrayImp {
    public static void main(String[ ]args){
        // Object[] mixedArry = { 1 ,'a' , 2, 'b' , 3, 'c', 4};
        Object[] mixedArry = { 1 ,"vishal" , 2, "VIkas" , 3, "Vilas", 4};

        ArrayList<Integer> number =new ArrayList<>();
        ArrayList<String> character = new ArrayList<>(); //  Character

        for( Object obj : mixedArry){
            if(obj instanceof Integer){
                number.add((Integer) obj);
            }else if(obj instanceof  String) // Character
            {
               character.add((String) obj); // Character
            }

            }
            System.out.println("Interger" + number);
            System.out.println("String" + character); // character
        }
    }
    

// Interger[1, 2, 3, 4]
// String[vishal, VIkas, Vilas]



// Object[] = array that can store anything (any type of object).

// It allows flexibility when you don't want to fix the type.

// Useful for cases like: [10, 'a', "hello", true, 3.14].
//In Java, you cannot store both integers and characters (or Strings) directly in an int[] array, because an int[] can only store integers. Instead, you should use an Object[] or ArrayList<Object> to store mixed types like int and String.


// Object[] lets you store mixed types.

// instanceof helps you check each value's type.

// ArrayList lets you dynamically store matched values.

// No complex functions used — just plain Java logic.

// Key Facts
// Object is part of java.lang package.

// All classes inherit from Object — even if you don’t write extends Object.

// Common methods in Object class:

// toString()

// equals()

// hashCode()

// getClass()


//********


// obj instanceof Integer → Is 10 an Integer?  Yes → so we cast it and add it to numbers.

// obj instanceof Character → Skipped because first condition was true.

// Let’s say obj = 'a'

// obj instanceof Integer →  No

// obj instanceof Character → Yes → so we cast it and add it to characters.


