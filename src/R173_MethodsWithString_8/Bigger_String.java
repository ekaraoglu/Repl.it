package R173_MethodsWithString_8;

public class Bigger_String {
    /*
    the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
     */

    public static String biggerS(String a , String b){

        String longest;

        if (a.length() > b.length()){

            longest = a;

        }else {

            longest = b;
        }

        return longest;
    }
}
