package MyStrings;
import java.util.Scanner;
public class St_01_StringMethods {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
// create a new string
        String str;
// get the user to enter a string
        System.out.print("Enter a string without spaces: ");
        str = keyboard.next();
// display the length of the user's string
        System.out.println("The length of the string is " + str.length());
// display the third character of the user's string
        System.out.println("The character at position 3 is " + str.charAt(2));
// display a selected part of the user's string
        System.out.println("Characters 2 to 4 are " + str.substring(1,4));
// display the user's string joined with another string
        System.out.println(str.concat(" was the string entered"));
// display the user's string in upper case
        System.out.println("This is upper case: " + str.toUpperCase());
// display the user's string in lower case
        System.out.println("This is lower case: " + str.toLowerCase());
    }
}
/*Method Description Inputs Output length Returns the length of the string None An item of
type int charAt Accepts an integer and returns the character at that position in the string. Note that
indexing starts from zero, not 1! You have been using this method in conjunction with
the next method of the Scanner class to obtain single characters from the keyboard
An item of type int An item of type char substring Accepts two integers (for example m and n)
and returns a copy of a chunk of the string. The chunk starts at position m and finishes at
position n-1. Remember that indexing starts from zero. (Study the example below.)
Two items of type int A
String
object
concat Accepts a string and returns a new string
which consists of the string that was sent in
joined on to the end of the original string
A
String
object
A
String
object
toUpperCase Returns a copy of the original string, all
upper case
None A
String
object
toLowerCase Returns a copy of the original string, all
lower case
None A
String
object
compareTo Accepts a string (say myString) and
compares it to the object’s string. It returns
zero if the strings are identical, a negative
number if the object’s string comes before
myString in the alphabet, and a positive
number if it comes later
A
String
object
An item of
type int
equals Accepts an object (such as a String) and
compares this to another object (such as
another String). It returns true if these
are identical, otherwise returns false
An object
of any
class
A
boolean
value
equalsIgnoreCase Accepts a string and compares this to the
original string. It returns true if the strings
are identical (ignoring case), otherwise
returns false
A
String
object
A
boolean
value
startsWith Accepts a string (say str) and returns
true if the original string starts with str
and false if it does not (e.g. “hello world”
starts with “h” or “he” or “hel” and so on)
A
String
object
A
boolean
value
endsWith Accepts a string (say str) and returns
true if the original string ends with str
and false if it does not (e.g. “hello world”
ends with “d” or “ld” or “rld” and so on)
A String object
A
boolean
value
trim Returns a String object, having removed
any spaces at the beginning or end
None A
String
object*/



