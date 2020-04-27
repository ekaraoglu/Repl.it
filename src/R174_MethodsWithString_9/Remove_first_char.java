package R174_MethodsWithString_9;

public class Remove_first_char {
    /*
    The method gets a string and returns a string minus the first letter.

for example:

removeFirst("aaa")
returns "aa"
     */

    public static String removeFirst(String target) {

        String str = target.substring(1);

        return str;
    }
}
